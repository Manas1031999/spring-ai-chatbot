package com.chat.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chat.example.service.ChatService;

@RestController
@RequestMapping("/chat")
public class ChatController {
	
	
	private final ChatService chatService;

	public ChatController(ChatService chatService) {
		this.chatService = chatService;
	}
	
	@GetMapping
	public String chat(@RequestParam String message) {
		return chatService.chat(message);
	}

}
