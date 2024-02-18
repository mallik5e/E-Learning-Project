package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Comments;

public interface CommentService {
	List<Comments> commentList();
	
	String addComment(Comments comment);
}
