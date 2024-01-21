package com.grz55.liftbook.dto.workout;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class WorkoutCreateRequestDTO {

    @NotNull(message = "Workout date cannot be null")
    private LocalDate workoutDate;

    private String gym;

    @NotNull(message = "Exercises cannot be null")
    @NotEmpty(message = "Exercises cannot be empty")
    private List<ExerciseCreateRequestDTO> exercises;

    private Integer lengthInMinutes;

    private String description;
}
