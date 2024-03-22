package org.gr40in.spring02.controllers;

import lombok.RequiredArgsConstructor;
import org.gr40in.spring02.dao.Student;
import org.gr40in.spring02.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class StudentsController {
    private final StudentRepository repository;

    @GetMapping(name = "students")
    public List<Student> findAllStudent() {
        return repository.findAllStudents();
    }
}
