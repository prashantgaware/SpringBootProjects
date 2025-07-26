package com.nt.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.entity.ErrorDetails;
import com.nt.exception.ActorNotFoundException;

//@ControllerAdvice
@RestControllerAdvice
public class ActorControllerAdvice {

	@ExceptionHandler(ActorNotFoundException.class)
	public ResponseEntity<?> handleActorNotFoundException(ActorNotFoundException anfe) {
		System.out.println("ActorControllerAdvice.handleActorNotFoundException()");
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), "500", anfe.getMessage());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleAllException(Exception ex) {
		System.out.println("ActorControllerAdvice.handleAllException()");
		ErrorDetails ed = new ErrorDetails(LocalDateTime.now(), "500", ex.getMessage());
		return new ResponseEntity<ErrorDetails>(ed, HttpStatus.NOT_FOUND);
	}
}
