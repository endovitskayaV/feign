package com.example.feign.controller;

import com.example.feign.client.IHomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    final IHomeClient IHomeClient;

    @Autowired
    public HomeController(IHomeClient IHomeClient){
        this.IHomeClient = IHomeClient;
    }

    @GetMapping("/rest-version")
    public String getVersion(){
        return  IHomeClient.getVersion(130L);
    }
}
