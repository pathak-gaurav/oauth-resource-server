package com.gauravpathak.oauthresourceserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {

    @GetMapping(value = "/public")
    public String helloPublic(){
        return "Hi There";
    }

    @GetMapping(value = "/private")
    public String helloPrivate(){
        return "Welcome to the dark side";
    }


}
