package com.example.chatapp.service;

import com.example.chatapp.model.ChatMessage;
import org.springframework.stereotype.Service;

@Service
public class MessageHandlerService {

    /**
     * Processes the chat message and returns the processed message.
     * @param message The incoming chat message.
     * @return The processed chat message.
     */
    public ChatMessage processMessage(ChatMessage message) {
        // Example: Add a simple server-side timestamp
        message.setContent("[Server Timestamp: " + System.currentTimeMillis() + "] " + message.getContent());
        return message;
    }
}
