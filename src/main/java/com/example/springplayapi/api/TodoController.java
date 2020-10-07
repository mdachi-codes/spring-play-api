package com.example.springplayapi.api;

import com.example.springplayapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.springplayapi.service.TodoService;

import java.util.List;

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
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @PutMapping
    public  Todo updateTodo(@RequestBody Todo todo){
        return todoService.updateTodo(todo.getTodoId(), todo);
    }

    @GetMapping
    public List<Todo> getTodo(){
        return todoService.getTodos();
    }
}
