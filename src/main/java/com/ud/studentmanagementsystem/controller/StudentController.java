package com.ud.studentmanagementsystem.controller;

import com.ud.studentmanagementsystem.model.Student;
import com.ud.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/api/get/{id}")
    public Optional<Student> findById(
            @PathVariable long id
    ){
        return studentRepository.findById(id);
    }

    @GetMapping("/api/get/all")
    public List<Student> findall(){
        return studentRepository.findAll();
    }

    @PostMapping("/api/post/save")
    public void save(
            @ModelAttribute Student student
    ){
        studentRepository.save(student);
    }

    @DeleteMapping("/api/delete")
    public void delete(
            @ModelAttribute Student student
    ){
        studentRepository.delete(student);
    }
}
