package com.learning_tracker.topic_service.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodosRepository {

    public List<String> findAll() {
        ArrayList<String> todos = new ArrayList<>();
        todos.add("Go to the Gym");
        return todos;
    }
}
