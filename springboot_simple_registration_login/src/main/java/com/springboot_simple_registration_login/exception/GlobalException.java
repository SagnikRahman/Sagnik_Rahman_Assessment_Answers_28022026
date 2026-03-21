package com.springboot_simple_registration_login.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalException {

	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserAlreadyExistsException.class)
    public String handleUserExists(Exception ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        return "login";
    }

	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFound(Exception ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        return "register";
    }
}