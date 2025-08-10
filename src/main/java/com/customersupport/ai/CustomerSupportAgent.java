package com.customersupport.ai;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.service.UserMessage;

@AiService
public interface CustomerSupportAgent {

    @UserMessage("""
        You are a helpful AI customer support agent. Use tools to answer questions.
    """)
    String chat(String message);

    @Tool("Check the status of a customer order given the order number")
    String getOrderStatus(String orderId);

    @Tool("Check if a product is available in stock")
    String checkProductAvailability(String productName);

    @Tool("Calculate estimated shipping time in days for a given location")
    String calculateShipping(String location);
}
