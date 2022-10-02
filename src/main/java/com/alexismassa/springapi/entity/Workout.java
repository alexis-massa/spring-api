package com.alexismassa.springapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "workout")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_workout;

    @Column(name = "title", nullable = false)
    private String title;

    @OneToMany(mappedBy = "seriePK.workout", cascade = CascadeType.ALL)
    private List<Serie> series;

}
