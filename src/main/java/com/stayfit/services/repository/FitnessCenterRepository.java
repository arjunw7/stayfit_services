package com.stayfit.services.repository;

import com.stayfit.services.domain.FitnessCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessCenterRepository extends JpaRepository<FitnessCenter, Integer> {
}
