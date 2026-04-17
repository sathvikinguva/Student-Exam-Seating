package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Course code cannot be blank")
    @Pattern(regexp = "^[A-Z0-9]+$", message = "Course code must be alphanumeric uppercase")
    private String courseCode;
    
    @Column(nullable = false)
    @NotBlank(message = "Course name cannot be blank")
    @Pattern(regexp = "^[a-zA-Z0-9\\s]+$", message = "Course name must contain only alphanumeric characters and spaces")
    private String courseName;
    
    @Column(nullable = false)
    @NotBlank(message = "Department cannot be blank")
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Department must contain only alphabets and spaces")
    private String department;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
