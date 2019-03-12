package com.rhiodamuthie.springbootin28m.rest;


import com.rhiodamuthie.springbootin28m.model.Todo;
import com.rhiodamuthie.springbootin28m.repository.TodoRepository;
import com.rhiodamuthie.springbootin28m.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoRestController {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;



    @GetMapping("/todo")
    public List<Todo> getAll(){
        return todoRepository.findAll();
    }

    @GetMapping("/todo/{id}")
    public Todo getOne(@PathVariable Long id){
        Optional<Todo> todoOptional = todoRepository.findById(id);
        Todo todo =new Todo();
        if (todoOptional.isPresent()) {
            todo = todoOptional.get();
        }
        return todo;
    }
}
