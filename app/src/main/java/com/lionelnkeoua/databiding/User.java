package com.lionelnkeoua.databiding;

public class User {

    private String name;
    private String adress;
    private String follower;
    private String following;


    public User(String name, String adress, String follower, String following) {
        this.name = name;
        this.adress = adress;
        this.follower = follower;
        this.following = following;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }
}
