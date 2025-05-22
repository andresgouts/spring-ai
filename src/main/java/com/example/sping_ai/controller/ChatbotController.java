package com.example.sping_ai.controller;

import com.example.sping_ai.controller.dto.ChatDto;
import com.example.sping_ai.service.ChatBotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequiredArgsConstructor
public class ChatbotController {

    private final ChatBotService chatBotService;

    @PostMapping("/chat")
    public String chat(@RequestBody ChatDto chatDto) {
        return chatBotService.chat(chatDto);
    }

    @PostMapping("/chatWithResources")
    public String chatWithResources(@RequestBody ChatDto chatDto) {
        return chatBotService.chatWithMedia(chatDto);
    }

    @PostMapping("/chatWithHomer")
    public String chatWithHomer(@RequestBody ChatDto chatDto) {
        return chatBotService.chatWithHomer(chatDto);
    }
}
