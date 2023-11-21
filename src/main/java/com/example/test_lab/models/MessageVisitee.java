package com.example.test_lab.models;

import java.util.List;

public class MessageVisitee {
    private List<Message> messages;

    public MessageVisitee(List<Message> messages) {
        this.messages = messages;
    }

    public void accept(MessageVisitor visitor) {
        for (Message message : messages) {
            visitor.visit(message);
        }
    }
}


