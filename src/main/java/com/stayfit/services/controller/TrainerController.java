package com.stayfit.services.controller;

import com.stayfit.services.domain.Trainer;
import com.stayfit.services.domain.User;
import com.stayfit.services.repository.MemberRepository;
import com.stayfit.services.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainerController {

    @Autowired
    private TrainerRepository trainerRepository;

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/trainers")
    public List<Trainer> retrieveUsers() {
        return trainerRepository.findAll();
    }


}
