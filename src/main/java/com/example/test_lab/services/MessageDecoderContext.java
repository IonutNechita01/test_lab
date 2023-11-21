package com.example.test_lab.services;

public class MessageDecoderContext {
    private MessageDecoder decoder = new MessiDecoder();

    public String decodeMessage(String message) {
        return decoder.decode(message);
    }
}
