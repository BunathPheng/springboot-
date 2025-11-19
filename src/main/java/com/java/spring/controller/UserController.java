package com.java.spring.controller;

import com.java.spring.model.dto.response.APIResponse;
import com.java.spring.model.entity.User;
import com.java.spring.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


//    public ResponseEntity<APIResponse<List<User>>> getUsers() {
//        System.out.println("Working on the get all users!");
//        APIResponse<List<User>> res = APIResponse.<List<User>>builder()
//                .message("success")
//                .payload(userService.findAllUsers())
//                .status(HttpStatus.OK) // keep only if it's part of APIResponse
//                .timestamp(LocalDateTime.now())
//                .build();
//
//        return ResponseEntity.ok(res);
//    }

    @GetMapping
    public ResponseEntity<APIResponse<List<User>>> getUsers() {
        System.out.println("Working on the get all users!");
        APIResponse<List<User>> res = APIResponse.<List<User>>builder()
                .message("success")
                .payload(userService.findAllUsers())
                .status(HttpStatus.OK) // keep only if it's part of APIResponse
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(res);
    }

    @GetMapping("/test")
    public String getString() {
        return "This API is working!";
    }
    @GetMapping("/hello")
    public String getStringd() {
        return "hello This API is working !";
    }
    @GetMapping("/g")
    public String getStringl() {
        return "hello This API is working !";
    }
    @GetMapping("/ges")
    public String getStringles() {
        return "hello This API is working !";
    }
    @GetMapping("/helloword")
    public String getStringlessssss() {
        return "hello This API is working !";
    }
    @GetMapping("/word")
    public String getStringlesssssst() {
        return "hello This API is working !";
    }
    @GetMapping("/wordsss")
    public String getStringlessssssts() {
        return "hello This API is working !";
    }
    @GetMapping("/s")
    public String getStringlesssssstss() {
        return "hello This API is working !";
    }
    @GetMapping("/Bunath")
    public String getStringlesssssstssss() {
        return "hello This API is working !";
    }
    @GetMapping("/Bunaths")
    public String getStringlesssssstsssss() {
        return "hello This API is working !";
    }
    @GetMapping("/Bunathssss")
    public String getStringlesssssstsssssssss() {
        return "hello This API is working !";
    }
    @GetMapping("/Smartops")
    public String getStringlesssssstssssssssssss() {
        return "hello This API is working !";
    }
    @GetMapping("/Smartopss")
    public String getStringlesssssstsssssssssssss() {
        return "hello This API is working !";
    }
    @GetMapping("/OPS")
    public String getStringlesssssstsssssssssssssops() {
        return "hello This API is working !";
    }
    @GetMapping("/OPSS")
    public String getStringlesssssstsssssssssssssopss() {
        return "hello This API is working !";
    }
    @GetMapping("/OPSSSSSSS")
    public String getStringlesssssstsssssssssssssopsssssss() {
        return "hello This API is working !";
    }
    @GetMapping("/OPSSSSSSSSSSSSSSSSSSSS")
    public String getStringlesssssstsssssssssssssopsssssssssssssss() {
        return "hello This API is working !";
    }
     @GetMapping("/OTS")
    public String getStringlesOTS() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSS")
    public String getStringlesOTSSS() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSSS")
    public String getStringlesOTSSSS() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSD")
    public String getStringlesOTSSSSD() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSDD")
    public String getStringlesOTSSSSDD() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSDDD")
    public String getStringlesOTSSSSDDD() {
        return "hello This API is working !";
    }
    @GetMapping("/OTSDDDDDDD")
    public String getStringlesOTSSSSDDDDDDD() {
        return "hello This API is working !";
    }
    @GetMapping("/ponith")
    public String getStringlesOTSSSSDDDDDDLLLD() {
        return "hello This API is working !";
    }
    @GetMapping("/ponithes")
    public String getStringlesOTSSSSDDDDDDLLLDS() {
        return "hello This API is working !";
    }
    @GetMapping("/iu")
    public String getStringlesOTSSSSDDDDDDLLLDSIU() {
        return "hello This API is working !";
    }
    @GetMapping("/i")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOO() {
        return "hello This API is working !";
    }
    @GetMapping("/iuuuuuuu")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUU() {
        return "hello This API is working !";
    }
    @GetMapping("/llllkkk")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDD() {
        return "hello This API is working !";
    }
    @GetMapping("/llllkkkooooo")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOO() {
        return "hello This API is working !";
    }
    @GetMapping("/pki")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpki() {
        return "hello This API is working !";
    }
    @GetMapping("/pkilllll")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillll() {
        return "hello This API is working !";
    }
    @GetMapping("/oi")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIO() {
        return "hello This API is working !";
    }
    @GetMapping("/oip")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOP() {
        return "hello This API is working !";
    }
    @GetMapping("/ppp")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPP() {
        return "hello This API is working !";
    }
    @GetMapping("/lolooooooo")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLololo() {
        return "hello This API is working !";
    }
    @GetMapping("/gigi")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologi() {
        return "hello This API is working !";
    }
    @GetMapping("/gigo")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigo() {
        return "hello This API is working !";
    }
    @GetMapping("/gugu")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGU() {
        return "hello This API is working !";
    }
    @GetMapping("/jiji")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjiji() {
        return "hello This API is working !";
    }
    @GetMapping("/gogo")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogo() {
        return "hello This API is working !";
    }
    @GetMapping("/loy")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloy() {
        return "hello This API is working !";
    }
    @GetMapping("/loiiiy")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiy() {
        return "hello This API is working !";
    }
    @GetMapping("/mkmk")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyll() {
        return "hello This API is working !";
    }
    @GetMapping("/yuyi")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyi() {
        return "hello This API is working !";
    }
     @GetMapping("/popopopo")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopo() {
        return "hello This API is working !";
    }
    @GetMapping("/loyyyyyyyyyyyyyyyyyyyyyyyy")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopop() {
        return "hello This API is working !";
    }
    @GetMapping("/loyyyyyyyyyyyyyyyyyyyyyyyyuuuuuuuuuuuuuu")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopooooooooo() {
        return "hello This API is working !";
    }
    @GetMapping("/loyyyyyyyyyyyyyyyyyyyyyyyyuuuuuuuuuuuuuuio")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooio() {
        return "hello This API is working !";
    }
    @GetMapping("/DS")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiods() {
        return "hello This API is working !";
    }
    @GetMapping("/LOKLOK")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslok() {
        return "hello This API is working !";
    }
    @GetMapping("/LOVE")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodsloklove() {
        return "hello This API is working !";
    }
    @GetMapping("/LOVEYOU")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuu() {
        return "hello This API is working !";
    }
    @GetMapping("/Mobile")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuupppp() {
        return "hello This API is working !";
    }
    @GetMapping("/ops")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppops() {
        return "hello This API is working !";
    }
    @GetMapping("/lynasok")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssok() {
        return "hello This API is working !";
    }
    @GetMapping("/kikilok")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkiki() {
        return "hello This API is working !";
    }
    @GetMapping("/GYGYGY")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikiki() {
        return "hello This API is working !";
    }
    @GetMapping("/FONG")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikikifog() {
        return "hello This API is working !";
    }
    @GetMapping("/hyy")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikikifoghyhy() {
        return "hello This API is working !";
    }
    @GetMapping("/hyrrrry")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikikifoghyhyggggg() {
        return "hello This API is working !";
    }
    @GetMapping("/goodpush")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikikifoghyhyggggglolo() {
        return "hello This API is working !";
    }
    @GetMapping("/VIVO")
    public String getStringlesOTSSSSDDDDDDLLLDSIUOOOOOOIUUUUDDDDKOOOpkillllIOPPPLolologigoGUGUjijigogoloiiiyllyuyipopopopoooooooooiodslokloveuuuppppopssokkikikikifoghyhyggggglolovivo() {
        return "hello This API is working !";
    }
}
