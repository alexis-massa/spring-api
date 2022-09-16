package com.alexismassa.springapi.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "series")
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_exercise", referencedColumnName = "id")
    private Exercise exercise;

    @Column(name = "timed")
    private boolean timed;

    @Column(name = "repetitions")
    private Integer repetitions;

    @Column(name = "time")
    private Time time;

    @Column(name = "rest")
    private Time rest;

}
