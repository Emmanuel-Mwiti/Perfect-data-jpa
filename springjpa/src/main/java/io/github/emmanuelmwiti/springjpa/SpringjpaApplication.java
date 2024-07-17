package io.github.emmanuelmwiti.springjpa;

import io.github.emmanuelmwiti.springjpa.models.Author;
import io.github.emmanuelmwiti.springjpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpaApplication.class, args);
    }

//    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("Emmanuel")
                    .lastName("Mwiti")
                    .age(33)
                    .email("kiuguemmanu@gmail.com")
                    .build();
            authorRepository.save(author);
        };
    }

}
