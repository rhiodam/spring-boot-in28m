package com.rhiodamuthie.springbootin28m.controller;

import com.rhiodamuthie.springbootin28m.model.Todo;
import com.rhiodamuthie.springbootin28m.repository.TodoRepository;
import com.rhiodamuthie.springbootin28m.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("name")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/list-todo", method = RequestMethod.GET)
        public String showTodos(ModelMap model){
        System.out.println(model);
        String name = (String) model.get("name");
        model.put("todos", todoService.retrieveTodos("in28Minutes"));
        return "list-todos";
    }

    @GetMapping("/list-todos")
//    @ResponseBody
    public String showAllTodos(ModelMap model){
        System.out.println(model);
        String name = (String) model.get("name");
        model.put("todos", todoService.retrieveTodos("in28Minutes"));
        return "list-todos";
//        return "hello";
    }

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
