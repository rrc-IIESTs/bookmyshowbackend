package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.TheatreSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository<TheatreSeatEntity, Integer> {
}
