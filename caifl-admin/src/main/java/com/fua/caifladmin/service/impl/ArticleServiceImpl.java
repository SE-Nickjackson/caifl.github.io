package com.fua.caifladmin.service.impl;

import com.fua.caifladmin.dao.ArticleDao;
import com.fua.caifladmin.entity.Article;
import com.fua.caifladmin.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2020-03-28 01:12:24
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;


    @Override
    public List<Article> queryArticles() {
        return articleDao.queryArticles();
    }

    @Override
    public int addArticle(Article article) {
        return articleDao.addArticle(article);
    }

    @Override
    public Article getArticleById(int id) {
        return articleDao.getArticleById(id);
    }

    @Override
    public int deleteArticleById(int id) {
        return articleDao.deleteArticleById(id);
    }
}