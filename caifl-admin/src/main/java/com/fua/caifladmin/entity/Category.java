package com.fua.caifladmin.entity;

import java.io.Serializable;

/**
 * @name: Category
 * @date: 2021/2/15 18:43
 * @author: nick_jackson
 * @describtion: 博文分类，用于对博文进行归纳整理
 **/
public class Category implements Serializable {
    private static final long serialVersionUID = -72349542952698496L;
    private Integer id;
    private String categoryName;
    private Integer parentId;
    private String parentIdPath;
    private Integer isHot;
    private Integer isShow;
    private String description;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getParentIdPath() {
        return parentIdPath;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public String getDescription() {
        return description;
    }


    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setParentIdPath(String parentIdPath) {
        this.parentIdPath = parentIdPath;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
