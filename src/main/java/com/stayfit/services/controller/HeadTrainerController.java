package com.stayfit.services.controller;

import com.stayfit.services.domain.HeadTrainer;
import com.stayfit.services.repository.HeadTrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class HeadTrainerController {

    @Autowired
    private HeadTrainerRepository headTrainerRepository;

    @GetMapping("/headTrainers")
    public List<HeadTrainer> retrieveHeadTrainers(){
        return headTrainerRepository.findAll();
    }
}
