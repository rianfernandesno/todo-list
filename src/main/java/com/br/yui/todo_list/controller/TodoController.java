package com.br.yui.todo_list.controller;

import com.br.yui.todo_list.entity.Todo;
import com.br.yui.todo_list.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    private TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @PostMapping
    public List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    public List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable Long id){
        return todoService.delete(id);
    }
}
