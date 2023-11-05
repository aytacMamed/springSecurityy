package com.changeside.springsecuritywithnewchanges.services;

import com.changeside.springsecuritywithnewchanges.dto.BlogRequest;
import com.changeside.springsecuritywithnewchanges.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> getAll();


    Blog getById(int id);

    void saveBlog(BlogRequest request);

    void deleteBlog(int id);

}
