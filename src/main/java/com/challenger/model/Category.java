package com.challenger.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * Author: David
 */

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    private Long categoryId;
    private String name;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Category> subCategories;

    @OneToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Event> events;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
