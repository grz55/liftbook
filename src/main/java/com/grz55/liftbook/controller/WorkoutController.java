package com.grz55.liftbook.controller;

import com.grz55.liftbook.dto.workout.WorkoutCreateRequestDTO;
import com.grz55.liftbook.dto.workout.WorkoutDTO;
import com.grz55.liftbook.service.IWorkoutService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts")
@AllArgsConstructor
@Validated
public class WorkoutController {

    private final IWorkoutService workoutService;

    @PostMapping
    public ResponseEntity<WorkoutDTO> createWorkout(
            @Valid @RequestBody WorkoutCreateRequestDTO workoutCreateRequestDTO) {
        WorkoutDTO createdWorkout = workoutService.createWorkout(workoutCreateRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWorkout);
    }
}
