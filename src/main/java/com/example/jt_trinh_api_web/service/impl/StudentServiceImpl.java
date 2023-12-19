package com.example.jt_trinh_api_web.service.impl;

import com.example.jt_trinh_api_web.entity.Student;
import com.example.jt_trinh_api_web.repository.StudentRepository;
import com.example.jt_trinh_api_web.service.StudentService;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
@Autowired
private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudents() {
        var listStudent =  studentRepository.findAll();
        System.out.println("call inside get all serviceimpl");
        if(listStudent.isEmpty()){
            return Collections.emptyList();
        }
        System.out.println("call inside get all " + listStudent.get(1));

        return listStudent;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);

    }
}
