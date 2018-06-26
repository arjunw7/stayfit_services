package com.stayfit.services.controller;

import com.stayfit.services.domain.Trainer;
import com.stayfit.services.domain.User;
import com.stayfit.services.repository.MemberRepository;
import com.stayfit.services.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@RestController
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;

    @GetMapping("/trainers")
    public List<Trainer> retrieveUsers() {
        return trainerRepository.findAll();
    }

    @GetMapping("/trainers/{id}")
    public Trainer retrieveTrainerByID(@PathVariable int id) {
        Optional<Trainer> trainer = trainerRepository.findById(id);
        if(!trainer.isPresent())
            throw new NullPointerException();
        else return trainer.get();
    }

    @GetMapping("/trainersByHeadTrainerId/{id}")
    public List<Trainer> retrieveTrainersByHeadTrainerID(@PathVariable int id) {
        return trainerRepository.findTrainerByHeadTrainerId(id);
    }


}
