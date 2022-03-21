package com.muwaffaq.innopolis.solid.homework;

import com.muwaffaq.innopolis.solid.homework.languages.*;


public class Human implements Needs {

    private String name;
    private String nickname;
    private Hobbies hobbies;
    private Business business;

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public Business getBusiness() {
        return business;
    }

    String sayHello(Language language) {
        return language.getGreeting();
    }

    void createNickName(String postFix) {
        nickname = name.concat(postFix);
    }

    @Override
    public void pray() {
    }

    @Override
    public void getMarried() {
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.sayHello(new Arabic()));
    }

}
