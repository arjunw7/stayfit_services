package com.stayfit.services.repository;

import com.stayfit.services.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

    public List<Trainer> findTrainerByHeadTrainerId(int id);
}
