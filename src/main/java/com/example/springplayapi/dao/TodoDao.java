package com.example.springplayapi.dao;

import com.example.springplayapi.model.Todo;

import java.util.UUID;

public interface TodoDao {

    String addTodo(Todo todo);

    default String updateTodo(Todo todo){
        UUID id = UUID.randomUUID();

        return updateTodo(id, todo);
    }

    String updateTodo(UUID todoId, Todo todo);
}
