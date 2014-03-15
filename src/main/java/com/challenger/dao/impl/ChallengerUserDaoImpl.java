package com.challenger.dao.impl;

import com.challenger.dao.ChallengerUserDao;
import com.challenger.model.ChallengerUser;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Author: David
 */

public class ChallengerUserDaoImpl extends HibernateDaoSupport implements ChallengerUserDao {
    @Override
    public void save(ChallengerUser challengerUser) {
        getHibernateTemplate().save(challengerUser);
    }

    @Override
    public void update(ChallengerUser challengerUser) {
        getHibernateTemplate().update(challengerUser);
    }

    @Override
    public void delete(ChallengerUser challengerUser) {
        getHibernateTemplate().delete(challengerUser);
    }

    @Override
    public ChallengerUser findUserByUsername(String username) {
        List list = getHibernateTemplate().find("from ChallengerUser where username=?", username);
        return (ChallengerUser)list.get(0);
    }

    @Override
    public List<ChallengerUser> findAllUsers() {
        List<ChallengerUser> challengerUserList = getHibernateTemplate().loadAll(ChallengerUser.class);
        return challengerUserList;
    }
}
