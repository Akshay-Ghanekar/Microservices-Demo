package com.quiz.service;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizManager {
	Quiz create(Quiz quiz);
	List<Quiz> get();
	Quiz getById(Long id);
}
