package com.grz55.liftbook.dto.workout;

import lombok.Data;

@Data
public class SetCreateRequestDTO {

    private Integer reps;

    private Double weight;

    private Integer durationInSeconds;
}
