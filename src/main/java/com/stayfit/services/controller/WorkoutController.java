package com.stayfit.services.controller;

import com.stayfit.services.domain.Workout;
import com.stayfit.services.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    public List<Workout> retrieveAllWorkouts(){
        return workoutRepository.findAll();
    }

}
