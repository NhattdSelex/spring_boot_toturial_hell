package com.example.jt_trinh_api_web.service;


import com.example.jt_trinh_api_web.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
