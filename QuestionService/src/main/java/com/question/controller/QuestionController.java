package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.services.QuestionManager;


@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionManager questionManager;
	
	@PostMapping
	public Question save(@RequestBody Question quiz)
	{
		return questionManager.create(quiz);
	}
	
	@GetMapping
	public List<Question> get()
	{
		return questionManager.get();
	}
	
	@GetMapping("/{id}")
	public Question getById(@PathVariable Long id)
	{
		return questionManager.getById(id);
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> findQuestionsOfQuiz(@PathVariable Long quizId)
	{
		return questionManager.getQuestionsOfQuiz(quizId);
	}
	
	
	
}
