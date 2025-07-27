package com.UrlHitCounter.UrlHitCounter.module;

public class Username {
    private String username;
    private int hitCount;

    public Username(String username, int hitCount) {
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

    public void setHitCount(int count) {
        this.hitCount = hitCount;
    }
}
