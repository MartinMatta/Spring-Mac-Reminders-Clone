package com.example.reminders.service;

import com.example.reminders.domain.Todo;
import com.example.reminders.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> getAllFlaggedTodos() {
        return todoRepository.findAllByFlagged(true);
    }

    @Override
    public void initCount(ModelMap model) {
        model.put("countToday", todoRepository.countByDate(new Date()));
        model.put("countScheduled", 2);
        model.put("countAll", todoRepository.count());
        model.put("countFlagged", todoRepository.countByFlagged(true));
    }

    @Override
    public void sortSelect(ModelMap model, String sort) {
        switch (sort) {
            case "today":
                model.put("listTodo", getAllTodos());
                break;
            case "scheduled":
                model.put("listTodo", getAllTodos());
                break;
            case "all":
                model.put("listTodo", getAllTodos());
                break;
            case "flagged":
                model.put("listTodo", getAllFlaggedTodos());
                break;
        }
    }

}
