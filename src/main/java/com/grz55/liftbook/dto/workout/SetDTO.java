package com.grz55.liftbook.dto.workout;

import java.util.UUID;
import lombok.Data;

@Data
public class SetDTO {

    private UUID id;

    private Integer reps;

    private Double weightInKilograms;

    private Integer durationInSeconds;
}
