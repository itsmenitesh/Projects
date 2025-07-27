package com.UrlHitCounter.UrlHitCounter.controller;

import com.UrlHitCounter.UrlHitCounter.module.Username;
import com.UrlHitCounter.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;


    @GetMapping("count")
    public int getHitCount(){
        return UrlHitService.increseTheCount();
    }
    @GetMapping("username/{username}/count")
    public Username getHitCountForUsername(@PathVariable String username){
        int hitCount = urlHitService.increseTheCount();
        return new Username(username , hitCount);
    }
}
