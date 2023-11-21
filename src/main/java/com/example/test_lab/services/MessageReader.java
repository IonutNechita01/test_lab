package com.example.test_lab.services;

import com.example.test_lab.TestLabApplication;
import com.example.test_lab.models.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class MessageReader {
    public List<Message> readMessagesFromFile(String url) throws IOException {
        return new ObjectMapper().readValue(new File(url), new TypeReference<List<Message>>() {});
    }
}
