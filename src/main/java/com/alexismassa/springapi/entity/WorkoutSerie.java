package com.alexismassa.springapi.entity;

import com.alexismassa.springapi.entity.key.WorkoutSerieKey;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@IdClass(WorkoutSerieKey.class)
@Table(name = "workout_serie")
public class WorkoutSerie {

    @Id
    @Column(name = "id_workout", nullable = false)
    private Long id_workout;

    @Id
    @Column(name = "id_serie", nullable = false)
    private Long id_serie;

    @Column(name = "repetitions")
    private int repetitions;

    @Column(name = "rest")
    private Time rest;
}
