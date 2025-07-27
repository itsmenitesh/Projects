package com.chatApi.chat_api.entities;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChatCompletionResponseTest {

    @Test
    void createChatCompletionResponse_ValidInput_Success() {
        ChatMessage chatMessage = new ChatMessage("user", "This is a propmt data.");
        ChatCompletionResponse.Choice choice = new ChatCompletionResponse.Choice(0, chatMessage);
        ChatCompletionResponse response = new ChatCompletionResponse(Collections.singletonList(choice));

        assertEquals(1, response.getChoices().size());
        assertEquals(chatMessage, response.getChoices().get(0).getMessage());
    }

}
