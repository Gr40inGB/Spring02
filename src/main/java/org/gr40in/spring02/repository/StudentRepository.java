package org.gr40in.spring02.repository;

import org.gr40in.spring02.dao.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.sql.DataSource;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {


    public List<Student> findAll();

}
