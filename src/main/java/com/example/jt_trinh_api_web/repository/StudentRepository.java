package com.example.jt_trinh_api_web.repository;

import com.example.jt_trinh_api_web.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StudentRepository extends JpaRepository<Student, Long> {
}
