package io.github.emmanuelmwiti.springjpa.repositories;

import io.github.emmanuelmwiti.springjpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
