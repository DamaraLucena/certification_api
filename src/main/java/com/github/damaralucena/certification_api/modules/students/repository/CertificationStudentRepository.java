package com.github.damaralucena.certification_api.modules.students.repository;

import com.github.damaralucena.certification_api.modules.students.entities.CertificationStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CertificationStudentRepository extends JpaRepository<CertificationStudent, UUID> {
  @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
  List<CertificationStudent> findByStudentEmailAndTechnology(String email, String technology);

}
