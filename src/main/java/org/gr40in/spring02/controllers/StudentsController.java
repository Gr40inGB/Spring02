package org.gr40in.spring02.controllers;

import lombok.RequiredArgsConstructor;
import org.gr40in.spring02.dao.Student;
import org.gr40in.spring02.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudentsController {
    private final StudentRepository repository;

    @GetMapping("/student")
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    //GET /student/search?name='studentName'
    @GetMapping("/student/search")
    public List<Student> searchByName(@RequestParam String name){
        return repository.findByNameContains(name);
    }


}
