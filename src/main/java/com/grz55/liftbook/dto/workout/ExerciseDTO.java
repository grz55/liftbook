package com.grz55.liftbook.dto.workout;

import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class ExerciseDTO {

    private UUID id;

    private String exerciseName;

    private List<SetDTO> sets;

    private Integer restTimeInSeconds;
}
