package com.example.reminders.service;

import com.example.reminders.domain.Todo;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

public interface TodoService {

    List<Todo> getAllTodos();
    List<Todo> getAllFlaggedTodos();

    void initCount(ModelMap model);
    void sortSelect(ModelMap model, String sort);

}
