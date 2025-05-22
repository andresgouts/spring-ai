package com.example.sping_ai.service;

import com.example.sping_ai.controller.dto.ChatDto;

public interface ChatBotService {
    String chat(ChatDto chatDto);
    String chatWithMedia(ChatDto chatDto);
    String chatWithHomer(ChatDto chatDto);
}
