package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.model.Todo;
import kr.re.kitri.spring2023.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    // Todos 전체보기
    @GetMapping("/todos")
    public List<Todo> todos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo todoById(@PathVariable int id) {
        return todoService.getTodoById(id);
    }

    @PostMapping("/todos")
    public Todo regist(@RequestBody Todo todo) {
        return todoService.setTodo(todo);
    }
}
