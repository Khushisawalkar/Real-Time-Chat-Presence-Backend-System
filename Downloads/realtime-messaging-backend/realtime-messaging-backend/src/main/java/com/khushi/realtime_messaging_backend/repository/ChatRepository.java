package com.khushi.realtime_messaging_backend.repository;

import com.khushi.realtime_messaging_backend.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<ChatMessage, Long> {
}