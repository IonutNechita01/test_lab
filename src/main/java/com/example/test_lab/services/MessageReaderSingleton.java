package com.example.test_lab.services;

import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class MessageReaderSingleton {

    private static MessageReader instance;

    private MessageReaderSingleton() {}
    public static synchronized MessageReader getInstance() {
        if (instance == null) {
            instance = new MessageReader();
        }
        return instance;
    }
}