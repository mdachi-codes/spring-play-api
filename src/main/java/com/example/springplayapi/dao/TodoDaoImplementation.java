package com.example.springplayapi.dao;

import com.example.springplayapi.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class TodoDaoImplementation implements TodoDao{
    @Override
    public String addTodo(Todo todo) {
        return null;
    }

    @Override
    public String updateTodo(UUID todoId, Todo todo) {
        return null;
    }
}
