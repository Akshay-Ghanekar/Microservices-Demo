package com.question.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repository.QuestionRepository;
@Service
public class QuestionManagerImpl implements QuestionManager {

	@Autowired
	private QuestionRepository questionRepository;
	@Override
	public Question create(Question quiz) {
		
		return questionRepository.save(quiz);
	}

	@Override
	public List<Question> get() {
		
		return questionRepository.findAll();
	}

	@Override
	public Question getById(Long id) {
		
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("question not found"));
	}

	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		
		return questionRepository.findByQuizId(quizId);
	}

}
