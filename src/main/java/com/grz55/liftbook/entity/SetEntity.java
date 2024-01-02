package com.grz55.liftbook.entity;

import jakarta.persistence.*;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "sets")
@NoArgsConstructor
@AllArgsConstructor
public class SetEntity {

    @Id @GeneratedValue private UUID id;

    private Integer reps;

    private Double weightInKilograms;

    private Integer durationInSeconds;

    @ManyToOne
    @JoinColumn(name = "exercise_uuid")
    private ExerciseEntity exercise;
}
