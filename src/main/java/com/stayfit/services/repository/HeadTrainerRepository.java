package com.stayfit.services.repository;

import com.stayfit.services.domain.HeadTrainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadTrainerRepository extends JpaRepository<HeadTrainer, Integer> {
}
