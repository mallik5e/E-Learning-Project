package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;
import com.example.demo.entities.Lesson;

public interface TrainerService {
  
	public String addCourse(Course course);
	
	public String saveCourse(Course course);
	
	public String addLesson(Lesson lesson);
	
	public Course getCourse(int courseId);
	
	public List<Course> courseList();
}
