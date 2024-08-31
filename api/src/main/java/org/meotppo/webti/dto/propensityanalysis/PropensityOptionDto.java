package org.meotppo.webti.dto.propensityanalysis;

import lombok.Builder;
import lombok.Getter;
import org.meotppo.webti.domain.entity.type.PersonalityType;

@Getter
public class PropensityOptionDto {
    private String answer;
    private PersonalityType personalityType;
    private int score;

    @Builder
    public PropensityOptionDto(String answer, PersonalityType personalityType, int score) {
        this.answer = answer;
        this.personalityType = personalityType;
        this.score = score;
    }
}
