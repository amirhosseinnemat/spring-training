package com.restsample.demo.controller;


import com.restsample.demo.entity.Student;
import com.restsample.demo.entity.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> students;

    // define post construct to load data ... only once.
    @PostConstruct
    public void loadData() {

        students = new ArrayList<>();

        students.add(new Student("ali", "karimi"));
        students.add(new Student("ramin", "mousavi"));
        students.add(new Student("saman", "borna"));
        students.add(new Student("amir", "nemat"));

    }


    // define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        return students;
    }

    // define endpoint for /students/{studentId} - return student by id with index.
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check studentId against list size
        if ((studentId) >= students.size() || (studentId < 0)) {
            throw new StudentNotFoundException("student id not found -- " + studentId);
        }

        return students.get(studentId);

    }

    // add an exception handler with @ExceptionHandler

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

        // create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        // return response entity

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    // add another exception handler ... to catch any exception (catch all)
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (Exception exc) {

        // create a StudentErrorResponse
        StudentErrorResponse errorResponse = new StudentErrorResponse();

        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(exc.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        // return response entity
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

    }
}
