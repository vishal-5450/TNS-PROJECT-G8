package com.tnsif.shoppingmall.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class AllExceptionHandler 
{
@ExceptionHandler(UserNotFound.class)

public ResponseEntity<ApiResponse> productNotFoundExceptionHandler(UserNotFound ex)
{
	String message=ex.getMessage();
	ApiResponse apiResponse=new ApiResponse();
	return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	
}

@ExceptionHandler(ItemNotFound.class)

public ResponseEntity<ApiResponse> ItemNotFoundExceptionHandler(ItemNotFound ex)
{
	String message=ex.getMessage();
	ApiResponse apiResponse=new ApiResponse();
	return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	
}
}