package com.stayfit.services.repository;

import com.stayfit.services.domain.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
}
