package com.changeside.springsecuritywithnewchanges.repository;

import com.changeside.springsecuritywithnewchanges.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
