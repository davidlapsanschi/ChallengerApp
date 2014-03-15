package com.challenger.model;

import javax.persistence.*;

/**
 * Author: David
 */

@Entity
@Table(name = "challenge")
public class Challenge {

    @Id
    @GeneratedValue
    private Long challengeId;
    @ManyToOne
    private Category category;
    private ChallengeStatus status;
    @ManyToOne
    private ChallengerUser user;
    @OneToOne
    private Event event;

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ChallengeStatus getStatus() {
        return status;
    }

    public void setStatus(ChallengeStatus status) {
        this.status = status;
    }

    public ChallengerUser getUser() {
        return user;
    }

    public void setUser(ChallengerUser user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
