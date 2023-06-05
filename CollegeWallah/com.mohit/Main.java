package com.mohit;

import CollegeWallah.com.mohit.services.TextMessageService;

public class Main {
    public static void main(String[] args) {
        TextMessageService t = new TextMessageService();
        t.sendMessage("Hello Guys");
    }

}
