package com.example.CRUD_Rapido.service;

import com.example.CRUD_Rapido.entity.student;
import com.example.CRUD_Rapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<student> getStudents() {
        return studentRepository.findAll();
    }

    public student getStudent(Long id) {
        Optional<student> student = studentRepository.findById(id);
        return student.orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public student saveOrUpdate(student student) {
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}