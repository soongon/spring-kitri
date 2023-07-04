package kr.re.kitri.spring2023.service;

import kr.re.kitri.spring2023.dao.TodoRepository;
import kr.re.kitri.spring2023.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;
    public List<Todo> getAllTodos() {
        return todoRepository.selectAllTodos();

    }

    public Todo getTodoById(int id) {
        return todoRepository.selectTodoById(id);
    }

    public Todo setTodo(Todo todo) {
        return todoRepository.insertTodo(todo);
    }
}
