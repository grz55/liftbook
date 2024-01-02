package com.grz55.liftbook.entity;

import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "exercises")
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseEntity {

    @Id @GeneratedValue private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "exercise_definition_id")
    private ExerciseDefinitionEntity exerciseDefinition;

    @OneToMany(orphanRemoval = true)
    private List<SetEntity> sets;

    private Integer restTimeInSeconds;

    @ManyToOne
    @JoinColumn(name = "workout_uuid")
    private WorkoutEntity workout;
}
