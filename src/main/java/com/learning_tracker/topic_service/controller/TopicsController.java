package com.learning_tracker.topic_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicsController {

    @GetMapping()
    public String getTopics() {
        return "topics";
    }
}
