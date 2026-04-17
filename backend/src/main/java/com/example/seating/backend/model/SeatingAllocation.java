package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "seating_allocations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatingAllocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @NotNull(message = "Exam ID cannot be null")
    @Positive(message = "Exam ID must be positive")
    private int examId;
    
    @Column(nullable = false)
    @NotNull(message = "Student ID cannot be null")
    @Positive(message = "Student ID must be positive")
    private int studentId;
    
    @Column(nullable = false)
    @NotNull(message = "Hall ID cannot be null")
    @Positive(message = "Hall ID must be positive")
    private int hallId;
    
    @Column(nullable = false)
    @NotNull(message = "Seat number cannot be null")
    @Positive(message = "Seat number must be positive")
    private int seatNumber;
    
    @Column(nullable = false)
    @NotBlank(message = "Allocation status cannot be blank")
    private String allocationStatus;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
