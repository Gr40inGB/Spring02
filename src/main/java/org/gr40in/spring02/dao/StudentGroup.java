package org.gr40in.spring02.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "student_groups")
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long name;
}
