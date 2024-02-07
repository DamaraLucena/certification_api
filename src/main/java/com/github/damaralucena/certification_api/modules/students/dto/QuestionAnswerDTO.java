package com.github.damaralucena.certification_api.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionAnswerDTO {

  private String questionID;
  private String alternativeID;
  private boolean isCorrect;

}
