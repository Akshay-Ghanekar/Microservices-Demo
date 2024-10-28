package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Quiz;
import com.quiz.service.QuizManager;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizManager quizManager;
	
	@PostMapping
	public Quiz save(@RequestBody Quiz quiz)
	{
		return quizManager.create(quiz);
	}
	
	@GetMapping
	public List<Quiz> get()
	{
		return quizManager.get();
	}
	
	@GetMapping("/{id}")
	public Quiz getById(@PathVariable Long id)
	{
		return quizManager.getById(id);
	}
	
	
}