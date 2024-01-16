package com.grz55.liftbook.mapper;

import com.grz55.liftbook.dto.workout.*;
import com.grz55.liftbook.entity.ExerciseEntity;
import com.grz55.liftbook.entity.SetEntity;
import com.grz55.liftbook.entity.WorkoutEntity;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface WorkoutMapper {

    @Mapping(target = "id", ignore = true)
    WorkoutEntity toEntity(WorkoutCreateRequestDTO workoutCreateRequestDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "exerciseDefinition", ignore = true)
    @Mapping(target = "workout", ignore = true)
    ExerciseEntity toExerciseEntity(ExerciseCreateRequestDTO exerciseCreateRequestDTO);

    List<ExerciseEntity> toExerciseEntityList(
            List<ExerciseCreateRequestDTO> exercisesCreateRequestDTOList);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "weightInKilograms", source = "weight")
    @Mapping(target = "exercise", ignore = true)
    SetEntity toSetEntity(SetCreateRequestDTO setCreateRequestDTO);

    List<SetEntity> toSetEntityList(List<SetCreateRequestDTO> setCreateRequestDTOList);

    WorkoutDTO toDTO(WorkoutEntity workoutEntity);

    @Mapping(target = "exerciseName", source = "exerciseDefinition.name")
    ExerciseDTO toExerciseDTO(ExerciseEntity exerciseEntity);

    SetDTO toSetDTO(SetEntity setEntity);

    List<SetDTO> toSetDTOList(List<SetEntity> setEntityList);
}
