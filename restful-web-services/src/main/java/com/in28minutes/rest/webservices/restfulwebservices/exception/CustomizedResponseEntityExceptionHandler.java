package com.in28minutes.rest.webservices.restfulwebservices.exception;

import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {
//
//        @ExceptionHandler(Exception.class)
//        public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
//        ExceptionResponse exceptionResponse =
//                new ExceptionResponse(new Date(), ex.getMessage(),
//                   request.getDescription(false),"CBLCommon");
//                return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//        @ExceptionHandler(UserNotFoundException.class)
//        public final ResponseEntity<Object> handleUserNotFoundException(
//                UserNotFoundException ex, WebRequest request) throws Exception {
//            ExceptionResponse exceptionResponse =
//                    new ExceptionResponse(new Date(), ex.getMessage(),
//                            request.getDescription(false),"CBL");
//            return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
//        }
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(
//            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        ExceptionResponse exceptionResponse =
//                new ExceptionResponse(new Date(),"Validation Failed" ,//ex.getMessage(),
//                        ex.getBindingResult().toString(),"CBL");
//        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
//    }

//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//                                                                  HttpHeaders headers,
//                                                                  HttpStatus status, WebRequest request) {
//
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", new Date());
//        body.put("message", status.value());
//
//        //Get all errors
//        List<String> errors = ex.getBindingResult()
//                .getFieldErrors()
//                .stream()
//                .map(x -> x.getDefaultMessage())
//                .collect(Collectors.toList());
//
//        body.put("details", errors);
//        body.put("business", "CBL");
//
//        return new ResponseEntity<>(body, headers, status);
//
//        //Map<String, String> fieldErrors = ex.getBindingResult().getFieldErrors().stream().collect(
//        //        Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
//
//    }
}
