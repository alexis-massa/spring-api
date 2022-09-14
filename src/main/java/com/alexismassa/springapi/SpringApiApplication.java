package com.alexismassa.springapi;

import com.alexismassa.springapi.entity.Exercise;
import com.alexismassa.springapi.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(SpringApiApplication.class, args);
    }

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public void run(String... args) throws Exception {

/*        Exercise exercise1 = Exercise.builder().title("Pull up").description("Grab the bar and pull up").build();

        Exercise exercise2 = Exercise.builder().title("Push up").description("Get down and push up").build();

        Exercise exercise3 = Exercise.builder().title("Sit up").description("Lay down and sit up").build();

        exerciseRepository.save(exercise1);
        exerciseRepository.save(exercise2);
        exerciseRepository.save(exercise3);*/

    }


}
