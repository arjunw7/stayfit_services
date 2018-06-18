package com.stayfit.services.repository;

import com.stayfit.services.domain.Exercise;
import com.stayfit.services.domain.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
