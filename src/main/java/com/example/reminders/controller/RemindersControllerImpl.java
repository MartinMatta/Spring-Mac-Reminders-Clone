package com.example.reminders.controller;

import com.example.reminders.domain.Todo;
import com.example.reminders.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RemindersControllerImpl implements RemindersController {

    private TodoService todoService;

    @Autowired
    public RemindersControllerImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public String showApp(ModelMap model, String sort) {
        todoService.initCount(model);
        todoService.sortSelect(model, sort);
        return "app";
    }

}
