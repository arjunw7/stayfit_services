package com.stayfit.services.controller;

import com.stayfit.services.domain.FitnessCenter;
import com.stayfit.services.repository.FitnessCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FitnessCenterController {
    @Autowired
    private FitnessCenterRepository fitnessCenterRepository;

    @GetMapping("/fitnessCenters")
    public List<FitnessCenter> retreiveCenters(){
        return fitnessCenterRepository.findAll();
    }

    @GetMapping("/fitnessCenters/{id}")
    public FitnessCenter retreiveCentersByID(@PathVariable int id){
        Optional<FitnessCenter> fitnessCenter =  fitnessCenterRepository.findById(id);
        if(!fitnessCenter.isPresent())
            throw new NullPointerException();
        else return fitnessCenter.get();
    }

    @PostMapping("/fitnessCenters")
    public FitnessCenter addCenter(@RequestBody FitnessCenter fitnessCenter){
        return fitnessCenterRepository.save(fitnessCenter);
    }
}
