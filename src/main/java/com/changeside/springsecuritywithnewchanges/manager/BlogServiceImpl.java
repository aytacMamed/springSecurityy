package com.changeside.springsecuritywithnewchanges.manager;

import com.changeside.springsecuritywithnewchanges.dto.BlogRequest;
import com.changeside.springsecuritywithnewchanges.entity.Blog;
import com.changeside.springsecuritywithnewchanges.mapper.BlogMapper;
import com.changeside.springsecuritywithnewchanges.repository.BlogRepository;
import com.changeside.springsecuritywithnewchanges.services.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlogServiceImpl implements BlogService {

    private final BlogMapper mapper;
    private final BlogRepository repository;

    @Override
    public List<Blog> getAll() {
        return repository.findAll();
    }


    @Override
    public Blog getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveBlog(BlogRequest request) {
        repository.save(mapper.blogRequestToEntity(request));
    }

    @Override
    public void deleteBlog(int id) {
        repository.deleteById(id);
    }
}