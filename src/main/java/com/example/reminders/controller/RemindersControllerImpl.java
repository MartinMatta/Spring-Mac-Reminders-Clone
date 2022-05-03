package com.example.reminders.controller;

import com.example.reminders.domain.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RemindersControllerImpl implements RemindersController {

    @Override
    public ModelAndView showApp(ModelMap model) {
        return new ModelAndView("app");
    }

}
