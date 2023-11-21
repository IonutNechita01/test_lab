package com.example.test_lab.models;

import com.example.test_lab.services.MessageDecoder;
import com.example.test_lab.services.MessageDecoderContext;

public class MessagePrintVisitor implements MessageVisitor {
    @Override
    public void visit(Message message) {
        System.out.println(new MessageDecoderContext().decodeMessage(message.getMessage()));
        System.out.println("Asa ar arata el:");
        System.out.println(message.getMessage());
    }
}
