package com.example.controller;
import com.example.model.TrainingCenter;
import com.example.repository.TrainingCenterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/trainingcenters")
@Validated
public class TrainingCenterController {
    private final TrainingCenterRepository repository;

    public TrainingCenterController(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = repository.save(trainingCenter);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
