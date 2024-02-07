package com.github.damaralucena.certification_api.modules.students.useCases;

import com.github.damaralucena.certification_api.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
  public boolean execute(VerifyHasCertificationDTO dto) {
    if (dto.getEmail().equals("damaralucenaa@gmail.com") && dto.getTechnology().equals("JAVA")) {
      return true;
    }
    return false;
  }

}
