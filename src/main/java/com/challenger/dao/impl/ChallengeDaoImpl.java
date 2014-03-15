package com.challenger.dao.impl;

import com.challenger.dao.ChallengeDao;
import com.challenger.model.Challenge;
import com.challenger.model.ChallengerUser;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Author: David
 */

public class ChallengeDaoImpl extends HibernateDaoSupport implements ChallengeDao {
    @Override
    public void save(Challenge challenge) {
        getHibernateTemplate().save(challenge);
    }

    @Override
    public void update(Challenge challenge) {
        getHibernateTemplate().update(challenge);
    }

    @Override
    public void delete(Challenge challenge) {
        getHibernateTemplate().delete(challenge);
    }

    @Override
    public List<Challenge> findChallengesForUser(ChallengerUser challengerUser) {
        List list = getHibernateTemplate().find("from Challenge where user=?", challengerUser);
        return list;
    }
}
