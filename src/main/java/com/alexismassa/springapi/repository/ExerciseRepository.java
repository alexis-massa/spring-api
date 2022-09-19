package com.alexismassa.springapi.repository;

import com.alexismassa.springapi.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
