package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

 

@Api(value = "Swagger-Student-Controller")
@RestController
@RequestMapping("/api")
public class StudentController {
    
    @Autowired
    private StudentService service;
    
    @ApiOperation(value = "Create Student information ")
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student stud) {
        return service.createStudent(stud);
    }
    
    @GetMapping("/findStudent/{id}")
    @ApiOperation(value = "Get Student details based on ID ")
    public Optional<Student> getStudentById(@PathVariable int id){
        return service.grtStudentById(id);
    }
    
    @GetMapping("/getAll")    
    public List<Student> getAllStudent(){
        return service.getAllStudents();
    }
    
    @ApiOperation("Delete Student based on Id")
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteById(@PathVariable int id) {
        return service.deleteStudentById(id);
        
    }
    
    
    
    

}
