package com.mjcompany.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjcompany.board.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	
}
