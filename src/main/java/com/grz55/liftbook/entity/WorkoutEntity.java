package com.grz55.liftbook.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "workouts")
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutEntity {

    @Id @GeneratedValue private UUID id;

    @Column(nullable = false)
    private LocalDate date;

    private String gym;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExerciseEntity> exercises;

    private Integer lengthInMinutes;

    private String description;
}
