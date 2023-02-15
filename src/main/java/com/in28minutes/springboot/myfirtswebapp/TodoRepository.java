package com.in28minutes.springboot.myfirtswebapp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.myfirtswebapp.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	public List<Todo> findByUsername(String username);
}