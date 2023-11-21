package com.example.test_lab.models;

import lombok.Getter;

import java.util.Date;

@Getter
public class Message {
    private Date date;
    private String message;
    private String house;

    public Message() {}

    public Message(Date date, String message, String house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}

