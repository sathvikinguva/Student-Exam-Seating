package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "invigilator_assignments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvigilatorAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @NotNull(message = "Exam ID cannot be null")
    @Positive(message = "Exam ID must be positive")
    private int examId;
    
    @Column(nullable = false)
    @NotNull(message = "Faculty ID cannot be null")
    @Positive(message = "Faculty ID must be positive")
    private int facultyId;
    
    @Column(nullable = false)
    @NotNull(message = "Hall ID cannot be null")
    @Positive(message = "Hall ID must be positive")
    private int hallId;
    
    @Column(nullable = false)
    @NotBlank(message = "Assignment status cannot be blank")
    private String assignmentStatus;
    
    @Column(nullable = false)
    private LocalDateTime assignedAt;
}
