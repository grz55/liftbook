package com.grz55.liftbook.controller;

import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionCreateRequestDTO;
import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionDTO;
import com.grz55.liftbook.service.IExerciseDefinitionService;
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
@RequestMapping("/exercise-definitions")
@AllArgsConstructor
@Validated
public class ExerciseDefinitionController {

    private final IExerciseDefinitionService exerciseDefinitionService;

    @PostMapping
    public ResponseEntity<ExerciseDefinitionDTO> createExerciseDefinition(
            @Valid @RequestBody
                    ExerciseDefinitionCreateRequestDTO exerciseDefinitionCreateRequestDTO) {
        ExerciseDefinitionDTO createdExerciseDefinition =
                exerciseDefinitionService.createExerciseDefinition(
                        exerciseDefinitionCreateRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdExerciseDefinition);
    }
}
