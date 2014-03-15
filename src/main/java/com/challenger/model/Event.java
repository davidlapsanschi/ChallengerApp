package com.challenger.model;

import javax.persistence.*;

/**
 * Author: David
 */

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long eventId;
    private String name;
    private String description;
    private Integer points;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
