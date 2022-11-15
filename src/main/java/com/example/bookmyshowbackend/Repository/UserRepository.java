package com.example.bookmyshowbackend.Repository;

import com.example.bookmyshowbackend.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
