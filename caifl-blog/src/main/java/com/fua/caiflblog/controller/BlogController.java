package com.fua.caiflblog.controller;

import com.fua.caiflblog.entity.Article;
import com.fua.caiflblog.service.ArticleService;
import com.fua.caiflblog.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @name: BlogController
 * @date: 2021/2/16 20:19
 * @author: nick_jackson
 * @describtion: 博文Controller接口
 **/
@Controller
@RequestMapping("blog")
public class BlogController {
    @Resource
    private ArticleService articleService;
    @Resource
    private CategoryService categoryService;


    @GetMapping("blogList")
    public String blogList(Model model, @RequestParam(value = "pn", defaultValue = "1") int pn, @RequestParam(value = "size", defaultValue = "6") int size) {
        PageHelper.startPage(pn, size);
        List<Article> articles = articleService.queryArticles();
        PageInfo<Article> page = new PageInfo<>(articles);
        model.addAttribute("page", page);
        return "blog-index";
    }

    @RequestMapping("/blog-list")
    public String blogList(){
        return "blog-list";
    }

    /**
     * 跳转到具体文章查看页面
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("toArticle")
    public String show(@RequestParam("id")int id, Model model) {
        Article article = articleService.getArticleById(id);
        if(!StringUtils.isEmpty(article)){
            model.addAttribute("article", article);
            String content = article.getContent();
            String path = "../mds/md"+String.valueOf(article.getId())+".md";
            File file = new File(path);
            if(!file.exists()){
                try {
                    file.createNewFile();
                    FileWriter fileWriter = new FileWriter(file.getName(), true);
                    BufferedWriter bufferWritter = new BufferedWriter(fileWriter);
                    bufferWritter.write(content);
                    bufferWritter.close();
                    System.out.println("Done!");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            return "blog-article";
        }
        return "404";

    }

}
