package com.grz55.liftbook.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotEmpty(message = "Name cannot be empty or null")
    @Column(nullable = false)
    private String name;

    private String pictureUrl;

    private String description;

    @NotNull(message = "Verified flag cannot be empty or null")
    @Column(nullable = false)
    private Boolean verifiedFlag;
}
