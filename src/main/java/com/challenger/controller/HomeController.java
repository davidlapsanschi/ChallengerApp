package com.challenger.controller;

import com.challenger.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import util.ChallengerUtils;

import java.util.List;

/**
 * Author: David
 */

@Controller
@RequestMapping(value = "/home")
public class HomeController {


    @RequestMapping(method = RequestMethod.GET)
    public String events(ModelMap model) {
        return "home";
    }
}
