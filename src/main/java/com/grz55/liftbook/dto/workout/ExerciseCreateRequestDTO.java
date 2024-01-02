package com.grz55.liftbook.dto.workout;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class ExerciseCreateRequestDTO {

    @NotNull(message = "Exercise definition cannot be null")
    private UUID exerciseDefinition;

    private List<SetCreateRequestDTO> sets;

    private Integer restTimeInSeconds;
}
