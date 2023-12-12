package com.grz55.liftbook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
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
    private String name;

    private String pictureUrl;

    private String description;

    @NotNull(message = "Verified flag cannot be empty or null")
    private Boolean verifiedFlag;
}