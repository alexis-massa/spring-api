package com.alexismassa.springapi.repository;

import com.alexismassa.springapi.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {

}
