package com.stayfit.services.controller;

import com.stayfit.services.domain.Goal;
import com.stayfit.services.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @GetMapping("/goals")
    public List<Goal> retrieveAllWorkouts(){
        return goalRepository.findAll();
    }
}
