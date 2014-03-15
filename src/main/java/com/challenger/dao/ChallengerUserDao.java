package com.challenger.dao;


import com.challenger.model.ChallengerUser;

import java.util.List;

/**
 * Author: David
 */

public interface ChallengerUserDao {
    public void save(ChallengerUser challengerUser);
    public void update(ChallengerUser challengerUser);
    public void delete(ChallengerUser challengerUser);
    public ChallengerUser findUserByUsername(String username);
    public List<ChallengerUser> findAllUsers();
}
