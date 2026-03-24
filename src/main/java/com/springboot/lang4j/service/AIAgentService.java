package com.springboot.lang4j.service;

import dev.langchain4j.service.spring.AiService;

@AiService
public interface AIAgentService {
	
	String chat(String message);

}
