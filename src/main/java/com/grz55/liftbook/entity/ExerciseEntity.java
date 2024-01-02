package com.grz55.liftbook.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @JoinColumn(name = "exercise_definition_uuid")
    private ExerciseDefinitionEntity exerciseDefinition;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, orphanRemoval = true)
    @NotNull
    @Size(min = 1)
    private List<SetEntity> sets;

    private Integer restTimeInSeconds;

    @ManyToOne
    @JoinColumn(name = "workout_uuid", nullable = false)
    private WorkoutEntity workout;
}
