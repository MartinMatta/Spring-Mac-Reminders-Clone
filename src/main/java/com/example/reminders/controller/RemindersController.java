package com.example.reminders.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public interface RemindersController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView showApp(ModelMap model);

}
