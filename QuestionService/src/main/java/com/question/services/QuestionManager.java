package com.question.services;

import java.util.List;

import com.question.entity.Question;

public interface QuestionManager {
	Question create(Question quiz);
	List<Question> get();
	Question getById(Long id);
	List<Question> getQuestionsOfQuiz(Long quizId); 
}