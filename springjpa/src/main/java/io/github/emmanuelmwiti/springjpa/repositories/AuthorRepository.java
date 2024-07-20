package io.github.emmanuelmwiti.springjpa.repositories;

import io.github.emmanuelmwiti.springjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where first_name='mwiti'
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name='mwiti'
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where first_name='%iti%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

//    List<Author> findAllByFirst
            
}
