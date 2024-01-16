package com.grz55.liftbook.dto.exercise_definition;

import jakarta.validation.constraints.NotBlank;
import java.util.UUID;
import lombok.Data;

@Data
public class ExerciseDefinitionDTO {

    private UUID id;

    @NotBlank(message = "Name cannot be null or empty")
    private String name;

    private String pictureUrl;

    private String description;

    private Boolean verifiedFlag;
}
