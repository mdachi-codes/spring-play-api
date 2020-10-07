package com.example.springplayapi.dao;

import com.example.springplayapi.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class TodoDaoImplementation implements TodoDao{
    @Override
    public Todo addTodo(Todo todo) {
        return todo;
    }

    @Override
    public Todo updateTodo(UUID todoId, Todo todo) {
        return null;
    }

    @Override
    public List<Todo> getTodos() {
        return null;
    }
}
