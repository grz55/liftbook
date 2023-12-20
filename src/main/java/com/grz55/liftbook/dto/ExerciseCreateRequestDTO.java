package com.grz55.liftbook.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ExerciseCreateRequestDTO {

    @NotBlank(message = "Name cannot be null or empty")
    private String name;

    private String pictureUrl;

    private String description;
}
