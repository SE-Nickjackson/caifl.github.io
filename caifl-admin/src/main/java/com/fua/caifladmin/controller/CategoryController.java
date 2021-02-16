package com.fua.caifladmin.controller;

import com.fua.caifladmin.entity.Book;
import com.fua.caifladmin.entity.Category;
import com.fua.caifladmin.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @name: CategoryController
 * @date: 2021/2/16 10:09
 * @author: nick_jackson
 * @describtion: 博文类别接口
 **/
@Controller
@RequestMapping("category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @RequestMapping("selectList")
    String selectList(Model model){
        List<Category> categories = categoryService.queryCategories();
        PageInfo<Category> page = new PageInfo<>(categories);
        model.addAttribute("page", page);
        return "category/category-list";
    }

    /**
     * 点击[添加]，跳转到category-add页面
     *
     * @return return前不可以加/
     */
    @GetMapping("to-book-add")
    public String toBookAdd() {
        return "category/category-add";
    }

    /**
     *
     * @param category
     * @return
     */
    @PostMapping("add")
    public String add(Category category) {
        categoryService.addCategory(category);
        return "redirect:/category/selectList";
    }

    /**
     * 根据id删除用户，然后再次发送查询的请求
     *
     * @param id
     * @return
     */
    @GetMapping("deleteById")
    public String deleteById(Integer id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/category/selectList";
    }


    /**
     * 点击编辑，book-edit页面
     *
     * @return
     */
    @GetMapping("to-category-edit/{id}")
    public String toAdminEdit(@PathVariable("id") Integer id, Model model) {
        Category editCategory = categoryService.getCategoryById(id);
        model.addAttribute("editCategory", editCategory);
        return "category/category-edit";
    }


    @PostMapping("update")
    public String update(Category category) {
        int i = categoryService.updateCategory(category);
        if(i>0){
            System.out.println("修改成功！");
        }
        return "redirect:/category/selectList";
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Category selectOne(Integer id) {
        return this.categoryService.getCategoryById(id);
    }
}
