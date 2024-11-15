package com.learning_tracker.topic_service.controller;


import com.learning_tracker.topic_service.service.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicsController {

    @Autowired
    private TopicsService topicsService;

    @GetMapping()
    public List<String> getTopics() {
        return this.topicsService.getTodos();
    }
}
