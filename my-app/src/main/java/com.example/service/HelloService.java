package com.example.service;

import com.example.model.Message;

public class HelloService {
    public String getMessage() {
        Message message = new Message();
        message.setContent("Hello from the Business Logic Layer!");
        return message.getContent();
    }
}
