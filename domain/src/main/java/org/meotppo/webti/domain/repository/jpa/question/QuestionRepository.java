package org.meotppo.webti.domain.repository.jpa.question;

import org.meotppo.webti.domain.entity.jpa.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
