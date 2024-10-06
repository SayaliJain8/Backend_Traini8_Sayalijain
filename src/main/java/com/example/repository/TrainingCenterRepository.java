package com.example.repository;

import com.example.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

// Change from class to interface
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    // You can define custom query methods here if needed
}
