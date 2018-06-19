package com.stayfit.services.controller;

import com.stayfit.services.domain.Exercise;
import com.stayfit.services.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ExerciseController {
    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping("/exercises")
    public List<Exercise> retrieveAllExercises(){return exerciseRepository.findAll();}
}
