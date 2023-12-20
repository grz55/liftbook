package com.grz55.liftbook.dto;

import java.util.UUID;
import lombok.Data;

@Data
public class ExerciseDTO {

    private UUID id;

    private String name;

    private String pictureUrl;

    private String description;

    private Boolean verifiedFlag;
}
