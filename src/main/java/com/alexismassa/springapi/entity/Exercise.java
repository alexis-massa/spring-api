package com.alexismassa.springapi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exercise;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

}
