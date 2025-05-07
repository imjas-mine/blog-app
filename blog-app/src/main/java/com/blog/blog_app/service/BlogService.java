package com.blog.blog_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.blog_app.entities.Blog;
import com.blog.blog_app.repository.BlogRepository;

@Service
public class BlogService {
	private final BlogRepository blogRepository;

	public BlogService(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}

	public List<Blog> getAllBlogs() {
		return blogRepository.findAll();
	}

	public Blog getBlogById(Integer id) {
		return blogRepository.findById(id).orElse(null);
	}

	public Blog saveBlog(Blog blog) {
		return blogRepository.save(blog);
	}

	public void deleteBlog(Integer id) {
		blogRepository.deleteById(id);
	}
}
