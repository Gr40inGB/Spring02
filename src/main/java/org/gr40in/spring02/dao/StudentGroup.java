package org.gr40in.spring02.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student_groups")

public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long name;
    @OneToMany
    @JoinColumn(name = "id")
    private List<Student> students;
}
