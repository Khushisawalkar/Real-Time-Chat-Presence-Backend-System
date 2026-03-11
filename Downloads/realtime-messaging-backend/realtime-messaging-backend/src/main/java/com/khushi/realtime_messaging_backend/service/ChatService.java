package com.khushi.realtime_messaging_backend.service;

import com.khushi.realtime_messaging_backend.model.ChatMessage;
import com.khushi.realtime_messaging_backend.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatRepository repository;

    public ChatService(ChatRepository repository) {
        this.repository = repository;
    }

    public ChatMessage saveMessage(ChatMessage message) {
        return repository.save(message);
    }
}