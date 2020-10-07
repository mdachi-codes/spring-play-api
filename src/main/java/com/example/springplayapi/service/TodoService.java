package com.example.springplayapi.service;

import com.example.springplayapi.dao.TodoDao;
import com.example.springplayapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoService {

    private final TodoDao todoDao;

    @Autowired
    public TodoService(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    public Todo addTodo(Todo todo){
        return todoDao.addTodo(todo);
    }

    public List<Todo> getTodos(){
        return null;
    }

    public Todo updateTodo(UUID id, Todo todo){
       return todoDao.updateTodo(id, todo);
    }
}
