package com.grz55.liftbook.dto.exercise_definition;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ExerciseDefinitionCreateRequestDTO {

    @NotBlank(message = "Name cannot be null or empty")
    private String name;

    private String pictureUrl;

    private String description;
}
