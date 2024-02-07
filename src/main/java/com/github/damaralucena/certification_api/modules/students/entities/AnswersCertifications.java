package com.github.damaralucena.certification_api.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertifications {

  private UUID id;
  private UUID certificationID;
  private UUID studentID;
  private UUID questionID;
  private UUID answerID;
  private boolean isCorrect;

}