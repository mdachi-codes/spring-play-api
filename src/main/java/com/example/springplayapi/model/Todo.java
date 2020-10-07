package com.example.springplayapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Todo {

    private final UUID todoId;

    private final String task;

    private final String state;

    public Todo(@JsonProperty("todoId") UUID todoId,
                @JsonProperty("task") String task,
                @JsonProperty("state") String state) {
        this.todoId = todoId;
        this.task = task;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String getTask() {
        return task;
    }

    public UUID getTodoId() {
        return todoId;
    }
}
