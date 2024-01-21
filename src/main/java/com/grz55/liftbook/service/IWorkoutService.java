package com.grz55.liftbook.service;

import com.grz55.liftbook.dto.workout.WorkoutCreateRequestDTO;
import com.grz55.liftbook.dto.workout.WorkoutDTO;

public interface IWorkoutService {

    WorkoutDTO createWorkout(WorkoutCreateRequestDTO workoutCreateRequestDTO);
}
