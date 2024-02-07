package com.github.damaralucena.certification_api.modules.students.repository;

import com.github.damaralucena.certification_api.modules.students.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
  public Optional<Student> findByEmail(String email);
}
