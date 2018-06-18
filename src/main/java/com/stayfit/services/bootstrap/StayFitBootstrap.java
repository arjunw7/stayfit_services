package com.stayfit.services.bootstrap;

import com.stayfit.services.domain.*;
import com.stayfit.services.repository.ExerciseRepository;
import com.stayfit.services.repository.GoalRepository;
import com.stayfit.services.repository.UserRepository;
import com.stayfit.services.repository.WorkoutRepository;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class StayFitBootstrap implements ApplicationListener<ContextRefreshedEvent>{


    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private GoalRepository goalRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Goal weightLoss = new Goal();
        weightLoss.setGoalType("Weight Loss");

        Goal weightGain = new Goal();
        weightGain.setGoalType("Weight Gain");

        Goal maintenance = new Goal();
        maintenance.setGoalType("Maintenance");

        goalRepository.save(weightGain);
        goalRepository.save(weightLoss);
        goalRepository.save(maintenance);

        Member arjun = new Member();
        arjun.setName("Arjun");
        arjun.setDob(new Date());
        arjun.setGoal(weightGain);

        Member ved = new Member();
        ved.setName("Ved");
        ved.setDob(new Date());
        ved.setGoal(weightLoss);

        userRepository.save(ved);
        userRepository.save(arjun);

        Exercise exercise = new Exercise();
        exercise.setName("Biceps Curl");
        exercise.setCaloriesBurn(22);

        exerciseRepository.save(exercise);

        Workout workout = new Workout();
        workout.setAssignedByUser(ved);
        workout.setAssignedForUser(arjun);
        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(exercise);
        workout.setExercises(exerciseList);
        workoutRepository.save(workout);
    }
}
