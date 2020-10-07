package com.example.springplayapi.api;

import com.example.springplayapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.springplayapi.service.TodoService;

@SpringBootApplication
@RequestMapping("api/v1/todo")
@RestController
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public String addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @GetMapping
    public String getTodo(){
        return "123";
    }
}
