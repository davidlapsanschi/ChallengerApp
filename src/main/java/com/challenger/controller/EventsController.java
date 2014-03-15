package com.challenger.controller;

import com.challenger.dao.CategoryDao;
import com.challenger.dao.ChallengerUserDao;
import com.challenger.model.Category;
import com.challenger.model.ChallengerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@RequestMapping(value = "/events")
public class EventsController {

    @Qualifier("categoryDao")
    @Autowired
    private CategoryDao categoryDao;

    @Qualifier("challengerUserDao")
    @Autowired
    private ChallengerUserDao challengerUserDao;


    @RequestMapping(method = RequestMethod.GET)
    public String events(ModelMap model) {

        ChallengerUtils.injectUser(model, challengerUserDao);
        List<Category> categories = categoryDao.findAllCategories();
        model.addAttribute("categories", categories);
        return "events";
    }

}
