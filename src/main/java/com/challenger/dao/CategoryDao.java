package com.challenger.dao;

import com.challenger.model.Category;

import java.util.List;

/**
 * Author: David
 */

public interface CategoryDao {
    public void save(Category category);
    public void update(Category category);
    public void delete(Category category);
    public Category findCategoryByName(String name);
    public List<Category> findAllCategories();
}
