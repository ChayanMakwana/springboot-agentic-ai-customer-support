package com.agenticplatform.services;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.SystemMessage;

@AiService
public interface AgentService {

    @SystemMessage("You are an AI Agent. Use tools when necessary to answer user queries.")
    String chat(@UserMessage String message);
}