package com.example.seating.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*; 
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Name must contain only alphabets and spaces")
    private String name;
    
    @Column(nullable = false, unique = true)
    @Email(message = "Email should be valid")
    private String email;
    
    @Column(nullable = false)
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
    private String phonenumber;
    
    @Column(nullable = false)
    @NotBlank(message = "Role cannot be blank")
    private String role;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;
}
