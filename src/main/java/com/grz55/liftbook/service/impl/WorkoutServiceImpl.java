package com.grz55.liftbook.service.impl;

import com.grz55.liftbook.dto.workout.ExerciseCreateRequestDTO;
import com.grz55.liftbook.dto.workout.WorkoutCreateRequestDTO;
import com.grz55.liftbook.dto.workout.WorkoutDTO;
import com.grz55.liftbook.entity.ExerciseDefinitionEntity;
import com.grz55.liftbook.entity.ExerciseEntity;
import com.grz55.liftbook.entity.WorkoutEntity;
import com.grz55.liftbook.exception.NotFoundException;
import com.grz55.liftbook.mapper.WorkoutMapper;
import com.grz55.liftbook.repository.ExerciseDefinitionRepository;
import com.grz55.liftbook.repository.WorkoutRepository;
import com.grz55.liftbook.service.IWorkoutService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class WorkoutServiceImpl implements IWorkoutService {

    private static final String EXERCISE_DEFINITION_NOT_FOUND_MSG =
            "Exercise definition not found with id: ";

    private final WorkoutRepository workoutRepository;
    private final ExerciseDefinitionRepository exerciseDefinitionRepository;
    private final WorkoutMapper workoutMapper;

    @Override
    public WorkoutDTO createWorkout(WorkoutCreateRequestDTO workoutCreateRequestDTO) {
        log.info("Creating workout for date: {}", workoutCreateRequestDTO.getDate());
        WorkoutEntity workoutEntity = workoutMapper.toEntity(workoutCreateRequestDTO);
        fetchWorkoutRelatedEntities(workoutEntity, workoutCreateRequestDTO);
        WorkoutEntity savedWorkout = workoutRepository.save(workoutEntity);
        log.info(
                "Workout for date {} created with id: {}",
                savedWorkout.getDate(),
                savedWorkout.getId());
        return workoutMapper.toDTO(savedWorkout);
    }

    private void fetchWorkoutRelatedEntities(
            WorkoutEntity workoutEntity, WorkoutCreateRequestDTO workoutCreateRequestDTO) {
        fetchExerciseDefinitions(
                workoutEntity.getExercises(), workoutCreateRequestDTO.getExercises());
    }

    private void fetchExerciseDefinitions(
            List<ExerciseEntity> exerciseEntities,
            List<ExerciseCreateRequestDTO> exerciseCreateRequests) {
        for (int i = 0; i < exerciseEntities.size(); i++) {
            Optional<ExerciseDefinitionEntity> exerciseDefinitionById =
                    exerciseDefinitionRepository.findById(
                            exerciseCreateRequests.get(i).getExerciseDefinition());
            if (exerciseDefinitionById.isPresent()) {
                exerciseEntities.get(i).setExerciseDefinition(exerciseDefinitionById.get());
            } else {
                throw new NotFoundException(
                        EXERCISE_DEFINITION_NOT_FOUND_MSG
                                + exerciseCreateRequests.get(i).getExerciseDefinition());
            }
        }
    }
}
