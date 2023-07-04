package kr.re.kitri.spring2023.dao;

import kr.re.kitri.spring2023.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {
    public List<Todo> selectAllTodos() {
        // DB 연동을해서 데이터를 가져옵니다.
        // select * from todo;
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "설겆이하기", false));
        todos.add(new Todo(2, "분리수거", false));
        todos.add(new Todo(3, "음악감상", true));
        todos.add(new Todo(4, "설겆이하기2", false));
        todos.add(new Todo(5, "설겆이하기3", false));
        return todos;
    }

    public Todo selectTodoById(int id) {
        return new Todo(id, "설겆이하기", false);
    }

    public Todo insertTodo(Todo todo) {
        return todo;
    }
}
