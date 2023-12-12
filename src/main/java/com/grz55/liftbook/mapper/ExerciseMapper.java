package com.grz55.liftbook.mapper;

import com.grz55.liftbook.dto.ExerciseCreateRequestDTO;
import com.grz55.liftbook.dto.ExerciseDTO;
import com.grz55.liftbook.entity.ExerciseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "verifiedFlag", ignore = true)
    ExerciseEntity toEntity(ExerciseCreateRequestDTO exerciseCreateRequestDTO);

    ExerciseDTO toDTO(ExerciseEntity exerciseEntity);
}