package com.grz55.liftbook.service.impl;

import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionCreateRequestDTO;
import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionDTO;
import com.grz55.liftbook.entity.ExerciseDefinitionEntity;
import com.grz55.liftbook.mapper.ExerciseDefinitionMapper;
import com.grz55.liftbook.repository.ExerciseDefinitionRepository;
import com.grz55.liftbook.service.IExerciseDefinitionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ExerciseDefinitionServiceImpl implements IExerciseDefinitionService {

    private final ExerciseDefinitionRepository exerciseDefinitionRepository;
    private final ExerciseDefinitionMapper exerciseDefinitionMapper;

    @Override
    public ExerciseDefinitionDTO createExerciseDefinition(
            ExerciseDefinitionCreateRequestDTO exerciseDefinitionCreateRequestDTO) {
        log.info("Creating exercise definition: {}", exerciseDefinitionCreateRequestDTO.getName());
        ExerciseDefinitionEntity exerciseDefinitionEntity =
                exerciseDefinitionMapper.toEntity(exerciseDefinitionCreateRequestDTO);
        exerciseDefinitionEntity.setVerifiedFlag(false);
        ExerciseDefinitionEntity savedExerciseDefinition =
                exerciseDefinitionRepository.save(exerciseDefinitionEntity);
        log.info(
                "Exercise definition {} created with id: {}",
                savedExerciseDefinition.getName(),
                savedExerciseDefinition.getId());
        return exerciseDefinitionMapper.toDTO(savedExerciseDefinition);
    }
}
