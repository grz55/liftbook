package com.grz55.liftbook.mapper;

import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionCreateRequestDTO;
import com.grz55.liftbook.dto.exercise_definition.ExerciseDefinitionDTO;
import com.grz55.liftbook.entity.ExerciseDefinitionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExerciseDefinitionMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "verifiedFlag", ignore = true)
    ExerciseDefinitionEntity toEntity(
            ExerciseDefinitionCreateRequestDTO exerciseDefinitionCreateRequestDTO);

    ExerciseDefinitionDTO toDTO(ExerciseDefinitionEntity exerciseDefinitionEntity);
}
