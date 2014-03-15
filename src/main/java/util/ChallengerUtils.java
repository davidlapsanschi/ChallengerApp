package util;

import com.challenger.dao.ChallengerUserDao;
import com.challenger.model.ChallengerUser;
import org.springframework.ui.ModelMap;

/**
 * Author: David
 */

public class ChallengerUtils {

    public static void injectUser(ModelMap model, ChallengerUserDao challengerUserDao) {
        ChallengerUser challengerUser = challengerUserDao.findUserByUsername("devyguitar");
        model.addAttribute("user", challengerUser);
    }
}
