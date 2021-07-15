package com.bok.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.bok.blog.dto.ResponseDto;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

		@ExceptionHandler(value=Exception.class)
	public ResponseDto<String> handleArgumentException(IllegalArgumentException e) {
			return new ResponseDto<String>(HttpStatus.OK.value(),e.getMessage());
	}
}
