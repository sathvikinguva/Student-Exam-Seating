package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "exam_halls")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExamHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Hall name cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Hall name must contain only alphanumeric characters and spaces")
    private String hallName;
    
    @Column(nullable = false)
    @NotBlank(message = "Building cannot be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Building must contain only alphabets and spaces")
    private String building;
    
    @Column(nullable = false)
    @NotNull(message = "Seating capacity cannot be null")
    @Positive(message = "Seating capacity must be greater than 0")
    private int seatingCapacity;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
