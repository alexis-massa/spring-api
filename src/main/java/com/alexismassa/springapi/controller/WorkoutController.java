package com.alexismassa.springapi.controller;

import com.alexismassa.springapi.entity.Workout;
import com.alexismassa.springapi.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    public List<Workout> fetchWorkouts() {
        return workoutRepository.findAll();
    }
}
