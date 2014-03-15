package com.challenger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: David
 */

@Controller
@RequestMapping(value = "/achievements")
public class AchievementsContrller {

    @RequestMapping(method = RequestMethod.GET)
    public String events(ModelMap model) {

        return "achievements";
    }
}
