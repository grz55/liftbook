package com.grz55.liftbook.controller;

import com.grz55.liftbook.dto.ExerciseCreateRequestDTO;
import com.grz55.liftbook.dto.ExerciseDTO;
import com.grz55.liftbook.service.IExerciseService;
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
@RequestMapping("/exercises")
@AllArgsConstructor
@Validated
public class ExerciseController {

    private final IExerciseService exerciseService;

    @PostMapping
    public ResponseEntity<ExerciseDTO> createExercise(
            @Valid @RequestBody ExerciseCreateRequestDTO exerciseCreateRequestDTO) {
        ExerciseDTO createdExercise = exerciseService.createExercise(exerciseCreateRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExercise);
    }
}
