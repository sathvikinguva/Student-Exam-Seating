package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "student_enrollments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @NotNull(message = "Student ID cannot be null")
    @Positive(message = "Student ID must be positive")
    private int studentId;
    
    @Column(nullable = false)
    @NotNull(message = "Course ID cannot be null")
    @Positive(message = "Course ID must be positive")
    private int courseId;
    
    @Column(nullable = false)
    private LocalDateTime enrollmentDate;
}
