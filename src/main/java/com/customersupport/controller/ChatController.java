package com.customersupport.controller;

import com.customersupport.ai.CustomerSupportAgent;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final CustomerSupportAgent agent;

    public ChatController(CustomerSupportAgent agent) {
        this.agent = agent;
    }

    @PostMapping
    public String chat(@RequestBody String message) {
        return agent.chat(message);
    }
}
