package com.changeside.springsecuritywithnewchanges.controller;

import com.changeside.springsecuritywithnewchanges.dto.BlogRequest;
import com.changeside.springsecuritywithnewchanges.entity.Blog;
import com.changeside.springsecuritywithnewchanges.manager.BlogServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@AllArgsConstructor
public class BlogController {
// FORM BASED AUTHENTICATION

    // open api - swagger
    private final BlogServiceImpl manager;

    @GetMapping
    public List<Blog> getAll(){
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable int id){
        return manager.getById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveBlog(@RequestBody BlogRequest request){
        manager.saveBlog(request);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        manager.deleteBlog(id);
    }

}