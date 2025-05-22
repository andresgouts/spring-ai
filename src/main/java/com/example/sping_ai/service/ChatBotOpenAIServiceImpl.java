package com.example.sping_ai.service;

import com.example.sping_ai.controller.dto.ChatDto;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class ChatBotOpenAIServiceImpl implements ChatBotService {

    private final ChatModel chatModel;
    @Qualifier("homerChatClient")
    private final ChatClient homerChatClient;

    public ChatBotOpenAIServiceImpl(ChatModel chatModel, ChatClient homerChatClient) {
        this.chatModel = chatModel;
        this.homerChatClient = homerChatClient;
    }

    @Override
    public String chat(ChatDto chatDto) {
        return chatModel.call(chatDto.getMessage());
    }

    @Override
    public String chatWithMedia(ChatDto chatDto) {
        return ChatClient.create(chatModel).prompt()
                .user(u -> u.text(chatDto.getMessage())
                        .media(MimeTypeUtils.IMAGE_PNG, new FileSystemResource(chatDto.getMediaPath())))
                .call()
                .content();
    }

    @Override
    public String chatWithHomer(ChatDto chatDto) {
        return homerChatClient.prompt(chatDto.getMessage()).call().content();
    }
}
