package com.example.CRUD_Rapido.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data 
@Entity
@Table(name="tbl_student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    private String firstName;

    @Column(name = "email_address", unique = true,nullable = false)
    private String email;
}
