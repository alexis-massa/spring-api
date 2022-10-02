package com.alexismassa.springapi.entity;

import com.alexismassa.springapi.entity.key.SeriePK;
import lombok.*;
import org.aspectj.weaver.loadtime.Options;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "serie")
@AssociationOverrides({
        @AssociationOverride(name = "seriePK.exercise", joinColumns = @JoinColumn(name = "id_exercise")),
        @AssociationOverride(name = "seriePK.workout", joinColumns = @JoinColumn(name = "id_workout"))
})
public class Serie {

    @EmbeddedId
    private SeriePK seriePK;

    @Transient
    private Exercise exercise;

    @Transient
    private Workout workout;

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
