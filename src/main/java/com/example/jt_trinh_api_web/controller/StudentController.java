package com.example.jt_trinh_api_web.controller;


import com.example.jt_trinh_api_web.entity.Student;
import com.example.jt_trinh_api_web.repository.StudentRepository;
import com.example.jt_trinh_api_web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @PostMapping()
    public Student createStudent(@RequestBody Student student){
        return this.studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable (value = "id") Long studentId){
        return this.studentService.getStudentById(studentId);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Student> deleteStudent(@PathVariable ("id") Long studentId){
        this.studentService.deleteStudentById(studentId);
        return ResponseEntity.ok().build();
    }




}
