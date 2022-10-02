package com.alexismassa.springapi.entity.key;

import com.alexismassa.springapi.entity.Exercise;
import com.alexismassa.springapi.entity.Workout;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SeriePK implements Serializable {

    @ManyToOne(cascade = CascadeType.ALL)
    private Exercise exercise;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    private Workout workout;

}
