package com.br.yui.todo_list.service;

import com.br.yui.todo_list.entity.Todo;
import com.br.yui.todo_list.repository.TodoRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TodoService {
    private TodoRepository todoRepository;

    private TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();

    }
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }


}