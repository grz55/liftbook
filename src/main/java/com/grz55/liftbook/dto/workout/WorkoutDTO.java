package com.grz55.liftbook.dto.workout;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class WorkoutDTO {

    private UUID id;

    @NotNull(message = "Date cannot be null")
    private LocalDate date;

    private String gym;

    @NotNull(message = "Exercises cannot be null")
    @NotEmpty(message = "Exercises cannot be empty")
    private List<ExerciseDTO> exercises;

    private Integer lengthInMinutes;

    private String description;
}
