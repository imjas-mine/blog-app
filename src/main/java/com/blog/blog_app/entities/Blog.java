package com.blog.blog_app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;

	@Column(columnDefinition = "TEXT")
	private String content;

	private String imageURL;

	private LocalDateTime createdAt;

	public Blog() {
		this.createdAt = LocalDateTime.now();
	}

}
