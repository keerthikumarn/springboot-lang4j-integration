package com.springboot.lang4j.provider;

import org.springframework.stereotype.Service;

import com.springboot.lang4j.service.AIAgentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultAiAgentProvider implements AIAgentProvider {

	private final AIAgentService aiAgentService;

	@Override
	public String ask(String question) {
		return aiAgentService.chat(question);
	}

}
