package com.chatApi.chat_api.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatCompilationRequest {
    private String model;
    private List<ChatMessage>messages;

    public ChatCompilationRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<ChatMessage>();
        this.messages.add(new ChatMessage("user",prompt));
    }
}
