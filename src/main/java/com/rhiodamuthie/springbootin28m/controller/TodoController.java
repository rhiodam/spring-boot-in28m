package com.rhiodamuthie.springbootin28m.controller;

import com.rhiodamuthie.springbootin28m.model.Todo;
import com.rhiodamuthie.springbootin28m.repository.TodoRepository;
import com.rhiodamuthie.springbootin28m.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
        model.put("todos", todoService.retrieveTodos(name));
        return "list-todos";
    }

    @GetMapping("/list-todos")
    public String showAllTodos(ModelMap model){
        System.out.println(model);
        String name = (String) model.get("name");
        model.put("todos", todoService.retrieveTodos(name));
        return "list-todos";
    }

    @GetMapping("/add-todo")
    public String showAddTodo(ModelMap modelMap){
        return "todo/add-todo";
    }

    @PostMapping("/add-todo")
    public String addTodo( ModelMap modelMap , @RequestParam String desc){
        todoService.addTodo((String) modelMap.get("name"), desc ,new Date(), false);
        return "redirect:/list-todos";
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

    @GetMapping("/hellowww")
    public String hello(){
        return "hello";
    }
}
