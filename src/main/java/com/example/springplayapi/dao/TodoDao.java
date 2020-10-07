package com.example.springplayapi.dao;

import com.example.springplayapi.model.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoDao {

    Todo addTodo(Todo todo);

    default Todo updateTodo(Todo todo){
        UUID id = UUID.randomUUID();

        return updateTodo(id, todo);
    }

    Todo updateTodo(UUID todoId, Todo todo);

    List<Todo> getTodos();
}
