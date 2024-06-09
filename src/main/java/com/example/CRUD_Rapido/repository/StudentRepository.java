package com.example.CRUD_Rapido.repository;

import com.example.CRUD_Rapido.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<student, Long> {
    Optional<student> findById(Long id); // Método correcto para buscar por id
}