package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Lesson;

import com.example.demo.repositories.LessonRepository;
import com.example.demo.repositories.UserRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	UserRepository ur;
	@Autowired
	LessonRepository lessonRepo;
	@Override
	public Lesson getLesson(int lessonId) {
		
		return lessonRepo.findById(lessonId).get();
		
	}
	
}
