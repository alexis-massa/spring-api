package com.alexismassa.springapi.repository;

import com.alexismassa.springapi.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}
