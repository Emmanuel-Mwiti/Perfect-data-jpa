package io.github.emmanuelmwiti.springjpa.repositories;

import io.github.emmanuelmwiti.springjpa.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
