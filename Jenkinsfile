pipeline {
    agent any

    environment {
        DOCKER_HUB_REPO = 'phengbunath/spring-app'
        DOCKER_IMAGE_TAG = "${BUILD_NUMBER}"
        MAVEN_OPTS = '-Dmaven.repo.local=.m2/repository'
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        maven 'Maven-3.8.6'
        jdk 'JDK-17'
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
                    junit 'target/surefire-reports/*.xml'
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
