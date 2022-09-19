package com.alexismassa.springapi.entity.key;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class SeriePK implements Serializable {
    private Long id_exercise;
    private Long id_workout;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SeriePK that = (SeriePK) o;
        return Objects.equals(id_exercise, that.id_exercise) &&
                Objects.equals(id_workout, that.id_workout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_exercise, id_workout);
    }

}
