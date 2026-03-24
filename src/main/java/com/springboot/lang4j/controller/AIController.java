package com.springboot.lang4j.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.lang4j.model.ResponseDTO;
import com.springboot.lang4j.provider.AIAgentProvider;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/ai")
@RequiredArgsConstructor
public class AIController {

	private final AIAgentProvider aiAgentProvider;

	@GetMapping("/chat")
	public ResponseEntity<ResponseDTO> chat(@RequestParam String question) {
		return ResponseEntity.ok().body(ResponseDTO.builder().message(aiAgentProvider.ask(question)).build());
	}

}
