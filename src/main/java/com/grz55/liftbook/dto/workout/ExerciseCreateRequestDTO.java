package com.grz55.liftbook.dto.workout;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class ExerciseCreateRequestDTO {

    @NotNull(message = "Exercise definition cannot be null")
    private UUID exerciseDefinition;

    @NotNull(message = "Sets cannot be null")
    @NotEmpty(message = "Sets cannot be empty")
    private List<SetCreateRequestDTO> sets;

    private Integer restTimeInSeconds;
}
