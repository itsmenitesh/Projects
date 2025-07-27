package com.chatApi.chat_api.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatMessageTest {

    @Test
    void createChatMessage_ValidInput_Success() {
        String role = "user";
        String content = "Nitesh, choudhary!";
        ChatMessage chatMessage = new ChatMessage(role, content);

        assertEquals(role, chatMessage.getRole());
        assertEquals(content, chatMessage.getContent());
    }


}
