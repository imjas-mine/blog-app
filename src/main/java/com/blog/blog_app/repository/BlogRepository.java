package com.blog.blog_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog_app.entities.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
