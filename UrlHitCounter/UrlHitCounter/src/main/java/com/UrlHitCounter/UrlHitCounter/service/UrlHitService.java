package com.UrlHitCounter.UrlHitCounter.service;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private static int hitCount;
    public static int increseTheCount(){
        return ++hitCount;
    }
    public int getCount(){

        return hitCount;
    }

}
