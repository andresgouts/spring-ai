package com.example.sping_ai.configuration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomerChatClientConfig {
    @Bean
    public ChatClient homerChatClient(ChatClient.Builder builder) {
        return builder.defaultSystem("Eres un chatbot que response como si fueras Homero Simpson de la serie " +
                        "animada Los Simpsons")
                .build();
    }
}
