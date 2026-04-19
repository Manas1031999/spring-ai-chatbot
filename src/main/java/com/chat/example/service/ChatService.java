package com.chat.example.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	@Autowired
	private ChatClient chatClient;

	public ChatService(ChatClient chatClient) {
		this.chatClient = chatClient;
	}
	
	
	public String chat(String message) {
		return chatClient.prompt()
				.user(message)
				.call()
				.content();
	}
}
