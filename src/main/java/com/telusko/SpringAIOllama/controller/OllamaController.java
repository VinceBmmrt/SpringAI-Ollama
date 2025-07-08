//package com.telusko.SpringAIOllama.controller;
//
//import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.ai.chat.memory.ChatMemory;
//import org.springframework.ai.chat.model.ChatResponse;
//import org.springframework.ai.ollama.OllamaChatModel;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@CrossOrigin(origins = "*")
//public class OllamaController {
//
//    private ChatClient chatClient;
//    private ChatMemory chatMemory;
//
//    public OllamaController(OllamaChatModel chatModel) {
//        this.chatClient = ChatClient.create(chatModel);
//    }

//    public OllamaController(ChatClient.Builder builder) {
//        this.chatMemory = MessageWindowChatMemory.builder().build();
//        this.chatClient = builder
//                .defaultAdvisors(MessageChatMemoryAdvisor.builder(chatMemory).build())
//                .build();
//    }

//    @GetMapping("/api/{message}")
//    public ResponseEntity<String> getAnswer(@PathVariable String message) {
//
//        ChatResponse chatResponse = chatClient
//                .prompt(message)
//                .call()
//                .chatResponse();
//
//        System.out.println(chatResponse.getMetadata().getModel());
//
//        String response = chatResponse
//                .getResult()
//                .getOutput()
//                .getText();
//
//        return ResponseEntity.ok(response);
//    }
//}
