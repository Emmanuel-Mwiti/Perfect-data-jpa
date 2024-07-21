package io.github.emmanuelmwiti.springjpa;

import com.github.javafaker.Faker;
import io.github.emmanuelmwiti.springjpa.models.Author;
import io.github.emmanuelmwiti.springjpa.models.Video;
import io.github.emmanuelmwiti.springjpa.repositories.AuthorRepository;
import io.github.emmanuelmwiti.springjpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ) {
        return args -> {
            for (int i = 0; i < 50; i++) {
                Faker faker = new Faker();
                var author = Author.builder()
                        .firstName(faker.name().firstName())
                        .lastName(faker.name().lastName())
                        .age(faker.number().numberBetween(19, 50))
                        .email("contact" + i + "@mwiti.com")
                        .build();
                authorRepository.save(author);
            }
            // Update author with id 1
            // 1. Checks id- select * from the author where id =1.
            // 2. Then updates the record with what you are saving.
            // <THOUGH THIS IS NOT FEASIBLE>
           /* var author = Author.builder()
                    .id(1)
                    .firstName("Emmanuel")
                    .lastName("Mwiti")
                    .age(28)
                    .email("contact@mwiti.com")
                    .build();
            authorRepository.save(author);*/

            // update Author a set a.age = 22 where a.id = 1
            authorRepository.updateAuthorById(22, 1);
            authorRepository.findByNamedQuery(40).forEach(System.out::println);
            /*var video = Video.builder()
                    .name("movie")
                    .length(120)
                    .build();
            videoRepository.save(video);*/
        };
    }

}
