package com.chatApi.chat_api.controller;


import com.chatApi.chat_api.entities.ChatCompilationRequest;
import com.chatApi.chat_api.entities.ChatCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChatController {

    @Autowired
    RestTemplate restTemplate;
    @PostMapping("/chatRequest")
    public  String getOpenAiResponse(@RequestBody String prompt){
        ChatCompilationRequest chatCompilationRequest= new ChatCompilationRequest("gpt-3.5-turbo",prompt);

        ChatCompletionResponse response=restTemplate.postForObject("https://api.openai.com/v1/chat/completions",chatCompilationRequest,ChatCompletionResponse.class);
        return response.getChoices().get(0).getMessage().getContent();


    }
}
