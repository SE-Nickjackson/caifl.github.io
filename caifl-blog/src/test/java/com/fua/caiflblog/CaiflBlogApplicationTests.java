package com.fua.caiflblog;

import com.fua.caiflblog.entity.Category;
import com.fua.caiflblog.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CaiflBlogApplicationTests {
    @Resource
    private CategoryService categoryService;

    @Test
    void contextLoads() {
        List<Category> categoryList = categoryService.queryCategories();
        for (Category category : categoryList) {
            System.out.println(category.getCategoryName());
        }
    }

}
