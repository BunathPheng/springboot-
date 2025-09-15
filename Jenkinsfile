pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = 'phengbunath/spring-app'
        DOCKER_IMAGE_TAG = "${BUILD_NUMBER}"
        MAVEN_OPTS = '-Dmaven.repo.local=.m2/repository'
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'  // adjust path if different
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        maven 'Maven-3.8.6'
        jdk 'JDK-17'   // make sure you configure JDK-17 in Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                echo "=== Checking out source code ==="
                git branch: 'main',
                    url: 'https://github.com/BunathPheng/springboot-.git',
                    credentialsId: 'git-credentials'
            }
        }

        stage('Build & Test') {
            steps {
                echo "=== Building and Testing Application ==="
                sh '''
                    echo "Maven version:"
                    mvn --version
                    echo "Building project..."
                    mvn clean compile test
                '''
            }
            post {
                always {
                    echo "=== Publishing Test Results ==="
                    junit 'target/surefire-reports/*.xml'   // ✅ replaced publishTestResults
                    publishHTML([
                        allowMissing: false,
                        alwaysLinkToLastBuild: true,
                        keepAll: true,
                        reportDir: 'target/site/jacoco',
                        reportFiles: 'index.html',
                        reportName: 'Code Coverage Report'
                    ])
                }
            }
        }

        stage('Package') {
            steps {
                echo "=== Packaging Application ==="
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: false
            }
        }

        stage('Docker Build & Push') {
            steps {
                echo "=== Building and Pushing Docker Image ==="
                script {
                    def dockerImage = docker.build("${DOCKER_HUB_REPO}:${DOCKER_IMAGE_TAG}")
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credentials') {
                        dockerImage.push()
                        dockerImage.push('latest')
                    }
                }
            }
        }

        stage('Deploy to Staging') {
            steps {
                echo "=== Deploying to Staging Environment ==="
                script {
                sshagent(['staging-server-key']) {
                    sh """
                        ssh -o StrictHostKeyChecking=no ubuntu@${STAGING_SERVER} '
                            echo "Pulling latest Docker image..."
                            docker pull ${DOCKER_HUB_REPO}:${DOCKER_IMAGE_TAG}

                            echo "Stopping existing container..."
                            docker stop spring-boot-staging || true
                            docker rm spring-boot-staging || true

                            echo "Starting new container..."
                            docker run -d --name spring-boot-staging -p 8080:8080 \
                                --restart unless-stopped \
                                ${DOCKER_HUB_REPO}:${DOCKER_IMAGE_TAG}

                            echo "Waiting for application to start..."
                            sleep 30

                            echo "Health check..."
                            curl -f http://localhost:8080/actuator/health || exit 1

                            echo "Deployment to staging completed successfully!"
                        '
                    """
                }
                }
            }
        }

        stage('Deploy to Production') {
            when {
                branch 'main'
            }
            steps {
                echo "=== Production Deployment Approval ==="
                script {
                    def userInput = input(
                        id: 'deploy-to-prod',
                        message: 'Deploy to production environment?',
                        parameters: [
                            choice(
                                choices: ['No', 'Yes'],
                                description: 'Confirm production deployment',
                                name: 'DEPLOY_TO_PROD'
                            )
                        ]
                    )

                    if (userInput == 'Yes') {
                        echo "=== Deploying to Production Environment ==="
                        sshagent(['production-server-key']) {
                            sh """
                                echo "Connecting to production server..."
                                ssh -o StrictHostKeyChecking=no ubuntu@your-production-server '
                                    echo "Pulling latest Docker image..."
                                    docker pull ${DOCKER_HUB_REPO}:${DOCKER_IMAGE_TAG}

                                    echo "Creating backup of current version..."
                                    docker tag spring-boot-prod spring-boot-prod-backup || true

                                    echo "Stopping current container..."
                                    docker stop spring-boot-prod || true
                                    docker rm spring-boot-prod || true

                                    echo "Starting new container..."
                                    docker run -d --name spring-boot-prod -p 8080:8080 \
                                        --restart unless-stopped \
                                        ${DOCKER_HUB_REPO}:${DOCKER_IMAGE_TAG}

                                    echo "Waiting for application to start..."
                                    sleep 30

                                    echo "Production health check..."
                                    curl -f http://localhost:8080/actuator/health || exit 1

                                    echo "Production deployment completed successfully!"
                                '
                            """
                        }
                    } else {
                        echo "Production deployment cancelled by user"
                    }
                }
            }
        }
    }

    post {
        success {
            echo "=== Pipeline completed successfully! ==="
        }
        failure {
            echo "=== Pipeline failed! ==="
        }
        always {
            echo "=== Cleaning up workspace ==="
            cleanWs()
        }
    }
}
