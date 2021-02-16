package com.fua.caifladmin.dao;

import com.fua.caifladmin.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @name: CategoryDao
 * @date: 2021/2/15 18:43
 * @author: nick_jackson
 * @describtion: 博文分类接口
 **/
@Mapper
public interface CategoryDao {

    Category getCategoryById(Integer catId);

    Category getCategoryByName(String categoryName);

    List<Category> queryCategories();

    int addCategory(Category category);

    int deleteCategoryById(Integer catId);

    int updateCategory(Category category);

}
