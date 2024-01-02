package com.grz55.liftbook.repository;

import com.grz55.liftbook.entity.WorkoutEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<WorkoutEntity, UUID> {}
