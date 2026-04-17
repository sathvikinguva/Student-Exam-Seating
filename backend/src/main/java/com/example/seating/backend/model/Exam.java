package com.example.seating.backend.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "exams")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @NotNull(message = "Course ID cannot be null")
    private int courseId;
    
    @Column(nullable = false)
    @NotBlank(message = "Exam type cannot be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Exam type must contain only alphabets and spaces")
    private String examType;
    
    @Column(nullable = false)
    @NotNull(message = "Exam date cannot be null")
    @FutureOrPresent(message = "Exam date must be present or future")
    private LocalDate examDate;
    
    @Column(nullable = false)
    @NotBlank(message = "Start time cannot be blank")
    @Pattern(regexp = "^([0-1][0-9]|2[0-3]):[0-5][0-9]$", message = "Start time must be in HH:mm format")
    private String startTime;
    
    @Column(nullable = false)
    @NotBlank(message = "End time cannot be blank")
    @Pattern(regexp = "^([0-1][0-9]|2[0-3]):[0-5][0-9]$", message = "End time must be in HH:mm format")
    private String endTime;
    
    @Column(nullable = false)
    @NotBlank(message = "Exam status cannot be blank")
    private String examStatus;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
