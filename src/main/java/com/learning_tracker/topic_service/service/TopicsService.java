package com.learning_tracker.topic_service.service;

import com.learning_tracker.topic_service.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicsService {

    @Autowired
    private TodosRepository todosRepository;

    public List<String> getTodos() {
        return this.todosRepository.findAll();
    }
}
