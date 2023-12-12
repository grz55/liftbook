package com.grz55.liftbook.service.impl;

import com.grz55.liftbook.dto.ExerciseCreateRequestDTO;
import com.grz55.liftbook.dto.ExerciseDTO;
import com.grz55.liftbook.entity.ExerciseEntity;
import com.grz55.liftbook.mapper.ExerciseMapper;
import com.grz55.liftbook.repository.ExerciseRepository;
import com.grz55.liftbook.service.IExerciseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ExerciseServiceImpl implements IExerciseService {

    private final ExerciseRepository exerciseRepository;
    private final ExerciseMapper exerciseMapper;

    @Override
    public ExerciseDTO createExercise(ExerciseCreateRequestDTO exerciseCreateRequestDTO) {
        log.info("Creating exercise: {}", exerciseCreateRequestDTO.getName());
        ExerciseEntity exerciseEntity = exerciseMapper.toEntity(exerciseCreateRequestDTO);
        exerciseEntity.setVerifiedFlag(false);
        ExerciseEntity savedExercise = exerciseRepository.save(exerciseEntity);
        log.info("Exercise {} created with id: {}", savedExercise.getName(), savedExercise.getId());
        return exerciseMapper.toDTO(savedExercise);
    }
}
