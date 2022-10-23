package com.carrezerv.company.controller;

import com.carrezerv.company.controller.response.ErrorResponse;
import com.carrezerv.company.exception.CustomNotFoundException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(CustomNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCustomNotFoundException(CustomNotFoundException e) {
        return ErrorResponse.builder()
                .code(e.getCode())
                .message(e.getMessage())
                .build();
    }


}
