package io.github.emmanuelmwiti.springjpa.repositories;

import io.github.emmanuelmwiti.springjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    List<Author> findByNamedQuery(@Param("age") int age);

    // update Author a set a.age = 22 where a.id = 1

    @Modifying
    @Transactional // Ideally in the service class
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthorById(int age, int id);

    // select * from author where first_name=?<Variable eg Mwiti>
    List<Author> findAllByFirstName(String fn);

    // select * from author where first_name=<Variable ignoring the case eg mwiti>
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // select * from author where first_name='%iti%'
    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    // select * from author where first_name='iti%'
    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn);

    // select * from author where first_name='%iti'
    List<Author> findAllByFirstNameEndingWithIgnoreCase(String fn);

    // select * from author where first_name in ('mwiti', 'emmanuel','mark')
    List<Author> findAllByFirstNameIn(List<String> firstNames);

}
