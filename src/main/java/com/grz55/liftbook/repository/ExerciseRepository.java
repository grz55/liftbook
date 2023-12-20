package com.grz55.liftbook.repository;

import com.grz55.liftbook.entity.ExerciseEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity, UUID> {}
