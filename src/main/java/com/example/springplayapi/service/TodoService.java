package com.example.springplayapi.service;

import com.example.springplayapi.dao.TodoDao;
import com.example.springplayapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TodoService {

    private final TodoDao todoDao;

    @Autowired
    public TodoService(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public String addTodo(Todo todo){
        return todoDao.addTodo(todo);
    }

    public String updateTodo(UUID id, Todo todo){
       return todoDao.updateTodo(id, todo);
    }
}
