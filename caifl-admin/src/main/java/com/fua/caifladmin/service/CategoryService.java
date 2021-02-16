package com.fua.caifladmin.service;

import com.fua.caifladmin.entity.Category;

import java.util.List;

/**
 * @name: CategoryService
 * @date: 2021/2/15 18:43
 * @author: nick_jackson
 * @describtion: 博文分类服务接口
 **/
public interface CategoryService {

    Category getCategoryById(Integer catId);

    Category getCategoryByName(String categoryName);

    List<Category> queryCategories();

    int addCategory(Category category);

    int deleteCategoryById(Integer catId);

    int updateCategory(Category category);

}
