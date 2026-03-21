package com.Springboot2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Springboot2.exception.NotFoundException;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String idNotFound(NotFoundException emp) {
		return emp.getMessage();
	}
}
