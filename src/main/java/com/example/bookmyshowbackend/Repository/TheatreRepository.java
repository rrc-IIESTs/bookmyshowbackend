package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<TheatreEntity, Integer> {
}
