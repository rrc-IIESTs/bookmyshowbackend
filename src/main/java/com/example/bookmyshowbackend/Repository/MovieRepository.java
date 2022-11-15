package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
}
