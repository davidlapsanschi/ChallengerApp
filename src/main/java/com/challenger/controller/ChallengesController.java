package com.challenger.controller;

import com.challenger.dao.CategoryDao;
import com.challenger.dao.ChallengeDao;
import com.challenger.dao.ChallengerUserDao;
import com.challenger.model.Category;
import com.challenger.model.Challenge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import util.ChallengerUtils;

import java.util.List;

/**
 * Author: David
 */

@Controller
@RequestMapping(value = "/challenges")
public class ChallengesController {

    @Qualifier("categoryDao")
    @Autowired
    private CategoryDao categoryDao;

    @Qualifier("challengerUserDao")
    @Autowired
    private ChallengerUserDao challengerUserDao;

    @Qualifier("challengeDao")
    @Autowired
    private ChallengeDao challengeDao;

    @RequestMapping(method = RequestMethod.GET)
    public String challenges(ModelMap model) {
        ChallengerUtils.injectUser(model, challengerUserDao);
        List<Challenge> challenges = challengeDao.findChallengesForUser(challengerUserDao.findUserByUsername("devyguitar"));

        model.addAttribute("challenges", challenges);
        List<Category> categories = categoryDao.findAllCategories();
        model.addAttribute("categories", categories);
        return "challenges";
    }

    @RequestMapping(value ="/saveChallenge", method = RequestMethod.GET, params = {"categoryName", "eventId"})
    public String saveChallenge(ModelMap model, @RequestParam(value = "categoryName") String categoryName, @RequestParam(value = "eventId") String eventId) {

        return "challenges";
    }
}
