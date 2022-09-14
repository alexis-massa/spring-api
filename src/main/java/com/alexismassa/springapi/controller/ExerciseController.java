package com.alexismassa.springapi.controller;

import com.alexismassa.springapi.entity.Exercise;
import com.alexismassa.springapi.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExerciseController {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @GetMapping("/exercises")
    public List<Exercise> fetchExercises(){
        return exerciseRepository.findAll();
    }
}
