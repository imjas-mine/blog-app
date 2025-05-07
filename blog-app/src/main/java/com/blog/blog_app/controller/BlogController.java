package com.blog.blog_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.blog_app.entities.Blog;
import com.blog.blog_app.service.BlogService;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
	private final BlogService blogService;

	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}

	@GetMapping
	public List<Blog> getAllBlogs() {
		return blogService.getAllBlogs();
	}

	@GetMapping("/{id}")
	public Blog getBlogById(@PathVariable Integer id) {
		return blogService.getBlogById(id);
	}

	@PostMapping
	public Blog createBlog(@RequestBody Blog blog) {
		return blogService.saveBlog(blog);
	}

	@PutMapping("/{id}")
	public Blog updateBlog(@PathVariable Integer id, @RequestBody Blog blogDetails) {
		Blog existingBlog = blogService.getBlogById(id);
		if (existingBlog == null)
			return null;

		existingBlog.setTitle(blogDetails.getTitle());
		existingBlog.setContent(blogDetails.getContent());
		existingBlog.setImageURL(blogDetails.getImageURL());

		return blogService.saveBlog(existingBlog);
	}

	@DeleteMapping("/{id}")
	public void deleteBlogById(@PathVariable Integer id) {
		blogService.deleteBlog(id);
	}

}
