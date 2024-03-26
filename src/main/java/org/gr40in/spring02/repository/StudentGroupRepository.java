package org.gr40in.spring02.repository;

import org.gr40in.spring02.dao.Student;
import org.gr40in.spring02.dao.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentGroupRepository extends JpaRepository<StudentGroup, Long> {

}
