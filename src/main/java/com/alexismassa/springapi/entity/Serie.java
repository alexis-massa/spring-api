package com.alexismassa.springapi.entity;

import com.alexismassa.springapi.entity.key.SeriePK;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@IdClass(SeriePK.class)
@Table(name = "serie")
public class Serie {

    @Id
    private Long id_exercise;

    @Id
    private Long id_workout;

    @Column(name = "position")
    private Integer position;

    @Column(name = "repetitions")
    private Integer repetitions;

    @Column(name = "time")
    private Integer time;

    @Column(name = "rest")
    private Integer rest;

    @Column(name = "series")
    private Integer series;

}
