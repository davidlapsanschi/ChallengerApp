package com.challenger.dao.impl;

import com.challenger.dao.CategoryDao;
import com.challenger.model.Category;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: David
 */

public class CategoryDaoImpl extends HibernateDaoSupport implements CategoryDao {
    @Override
    public void save(Category category) {
        getHibernateTemplate().save(category);
    }

    @Override
    public void update(Category category) {
        getHibernateTemplate().update(category);
    }

    @Override
    public void delete(Category category) {
        getHibernateTemplate().delete(category);
    }

    @Override
    public Category findCategoryByName(String name) {
        List list = getHibernateTemplate().find("from category where name=?", name);
        return (Category)list.get(0);
    }

    @Override
    public List<Category> findAllCategories() {
        List<Category> categories = getHibernateTemplate().loadAll(Category.class);
        List<Category> newCategories = new ArrayList<Category>();
        for(Category category: categories) {
           if(category.getSubCategories() != null && category.getSubCategories().size() > 0) {
              newCategories.add(category);
           }
        }
        return newCategories;
    }
}
