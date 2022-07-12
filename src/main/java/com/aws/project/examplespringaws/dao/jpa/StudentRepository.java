package com.aws.project.examplespringaws.dao.jpa;

import com.aws.project.examplespringaws.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentRepository extends JpaRepository<Student,String>, JpaSpecificationExecutor<Student> {
}
