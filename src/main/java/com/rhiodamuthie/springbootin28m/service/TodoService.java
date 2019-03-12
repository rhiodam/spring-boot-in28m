package com.rhiodamuthie.springbootin28m.service;

import com.rhiodamuthie.springbootin28m.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static Long todoCount = 4L;

    static {
        todos.add(new Todo(1L, "in28Minutes", "Learn Spring MVC", new Date(), false));
        todos.add(new Todo(2L, "in28Minutes", "Learn Struts", new Date(), false));
        todos.add(new Todo(3L, "in28Minutes", "Learn Hibernate", new Date(),false));
        todos.add(new Todo(4L, "in28Minutes", "Learn JSF", new Date(),false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todos.add(new Todo( ++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(Long id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }
}
