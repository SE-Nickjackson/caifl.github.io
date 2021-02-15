package com.fua.caifladmin.service.impl;

import com.fua.caifladmin.dao.CategoryDao;
import com.fua.caifladmin.entity.Category;
import com.fua.caifladmin.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @name: CategoryServiceImpl
 * @date: 2021/2/15 18:52
 * @author: nick_jackson
 * @describtion: 博文分类服务接口
 **/
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    @Override
    public Category getCategoryById(Integer id) {
        return categoryDao.getCategoryById(id);
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        return categoryDao.getCategoryByName(categoryName);
    }

    @Override
    public List<Category> queryCategories() {
        return categoryDao.queryCategories();
    }

    @Override
    public int addCategory(Category category) {
        return categoryDao.addCategory(category);
    }

    @Override
    public int deleteCategoryById(Integer id) {
        return categoryDao.deleteCategoryById(id);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryDao.updateCategory(category);
    }
}
