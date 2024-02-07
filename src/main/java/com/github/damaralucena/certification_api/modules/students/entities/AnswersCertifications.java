package com.github.damaralucena.certification_api.modules.students.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answers_certification_students")
public class AnswersCertifications {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "certification_id")
  private UUID certificationID;

  @ManyToOne()
  @JoinColumn(name = "certification_id", insertable = false, updatable = false)
  private CertificationStudent certificationStudent;

  @Column(name = "student_id")
  private UUID studentID;

  @ManyToOne
  @JoinColumn(name = "student_id", insertable = false, updatable = false)
  private Student student;

  @Column(name = "question_id")
  private UUID questionID;

  @Column(name = "answer_Id")
  private UUID answerID;

  @Column(name = "is_correct")
  private boolean isCorrect;

  @CreationTimestamp
  private LocalDateTime createdAt;

}