package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-app")
public interface IHomeClient {

    @RequestMapping("/version/{id}")
    String getVersion(@PathVariable("id") Long id);
}
