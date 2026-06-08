package com.example.foodvoting.controller;

import jakarta.validation.ConstraintViolationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({IllegalArgumentException.class, ConstraintViolationException.class,
            MethodArgumentNotValidException.class})
    public String handleBadRequest(RuntimeException ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        model.addAttribute("status", 400);
        return "error";
    }

    @ExceptionHandler(RuntimeException.class)
    public String handleNotFound(RuntimeException ex, Model model) {
        model.addAttribute("error", ex.getMessage());
        model.addAttribute("status", 500);
        return "error";
    }
}
