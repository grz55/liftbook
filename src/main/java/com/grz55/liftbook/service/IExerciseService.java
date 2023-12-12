package com.grz55.liftbook.service;

import com.grz55.liftbook.dto.ExerciseCreateRequestDTO;
import com.grz55.liftbook.dto.ExerciseDTO;

public interface IExerciseService {

    ExerciseDTO createExercise(ExerciseCreateRequestDTO exerciseCreateRequestDTO);
}
