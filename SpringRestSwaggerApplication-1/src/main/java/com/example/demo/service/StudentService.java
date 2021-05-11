package com.example.demo.service;

import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

 

 

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo repo;
    
    public Student createStudent(Student stud) {
        return repo.save(stud);
    }
    
    public Optional<Student> grtStudentById(int id){
        return repo.findById(id);
        
    }
    
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    
    public String deleteStudentById(int id) {
        repo.deleteById(id);
        return "delete" + id;
    }

}
