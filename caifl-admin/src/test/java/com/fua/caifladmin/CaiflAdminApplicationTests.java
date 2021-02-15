package com.fua.caifladmin;

import com.fua.caifladmin.entity.Category;
import com.fua.caifladmin.entity.User;
import com.fua.caifladmin.service.CategoryService;
import com.fua.caifladmin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CaiflAdminApplicationTests {

    @Resource
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

//    @Test
//    void contextLoads() {
//    }


    /**
     * 测试登录
     */
//    @Test
//    void testLogin(){
//        User caifl = userService.queryByName("caifl");
//        System.out.println("hello world!");
//        System.out.println(caifl.toString());
//        List<User> users = userService.queryList();
//        System.out.println("hello world!");
//        System.out.println(users);
//    }

    /**
     * 测试博文分类
     */
//    @Test
//    void testCategory(){
//        Category category = new Category();
//        category.setCategoryName("框架");
//        category.setDescription("主要介绍各类框架，诸如SpringBoot， Vue等等");
//        category.setIsHot(0);
//        category.setIsShow(0);
//        category.setParentId(0);
//        category.setParentIdPath("0_2");
//
//        List<Category> categories = categoryService.queryCategories();
//        for (Category category1 : categories) {
//            System.out.println(category1.getCategoryName());
//        }
//
//        int i = categoryService.addCategory(category);
//        if(i>0){
//            System.out.println("成功添加");
//        }
//        int t = categoryService.deleteCategoryById(20);
//        if(t>0){
//            System.out.println("删除成功！！！");
//        }
//        Category categoryById = categoryService.getCategoryById(19);
//        System.out.println(categoryById.getCategoryName());
//        categoryById.setCategoryName("AI");
//        int t = categoryService.updateCategory(categoryById);
//        if(t>0){
//            System.out.println("更新成功！");
//        }
//    }

}
