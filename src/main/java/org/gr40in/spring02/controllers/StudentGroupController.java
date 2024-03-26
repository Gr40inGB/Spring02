package org.gr40in.spring02.controllers;

import lombok.RequiredArgsConstructor;
import org.gr40in.spring02.dao.Student;
import org.gr40in.spring02.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("group")
public class StudentGroupController {
    private final StudentRepository repository;


    @GetMapping("{id}/student")
    public @ResponseBody List<Student> findByGroup(@PathVariable Long id) {
        return repository.findAllByStudentGroupId(id);
    }


}
