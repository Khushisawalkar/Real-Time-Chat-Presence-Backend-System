package com.khushi.realtime_messaging_backend.controller;

import com.khushi.realtime_messaging_backend.model.ChatMessage;
import com.khushi.realtime_messaging_backend.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService service;

    public ChatController(ChatService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public ChatMessage sendMessage(@RequestBody ChatMessage message) {
        return service.saveMessage(message);
    }
}