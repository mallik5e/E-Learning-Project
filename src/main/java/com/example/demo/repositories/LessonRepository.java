package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}
