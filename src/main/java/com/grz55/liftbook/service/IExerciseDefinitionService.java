package com.grz55.liftbook.service;

import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionCreateRequestDTO;
import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionDTO;

public interface IExerciseDefinitionService {

    ExerciseDefinitionDTO createExerciseDefinition(
            ExerciseDefinitionCreateRequestDTO exerciseDefinitionCreateRequestDTO);
}
