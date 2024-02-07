package com.github.damaralucena.certification_api.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudent {

  private UUID id;
  private UUID studentID;
  private String technology;
  private int grade;
  List<AnswersCertifications> answersCertifications;


}
