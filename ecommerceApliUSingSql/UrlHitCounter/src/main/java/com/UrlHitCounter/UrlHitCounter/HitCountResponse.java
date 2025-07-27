package com.example.demo.model;

public class HitCountResponse {
    private String username;
    private int hitCount;

    public HitCountResponse(String username, int hitCount) {
        this.username = username;
        this.hitCount = hitCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
