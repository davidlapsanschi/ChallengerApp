package com.challenger.dao;

import com.challenger.model.Challenge;
import com.challenger.model.ChallengerUser;

import java.util.List;

/**
 * Author: David
 */

public interface ChallengeDao {
    public void save(Challenge challenge);
    public void update(Challenge challenge);
    public void delete(Challenge challenge);
    public List<Challenge> findChallengesForUser(ChallengerUser challengerUser);
}
