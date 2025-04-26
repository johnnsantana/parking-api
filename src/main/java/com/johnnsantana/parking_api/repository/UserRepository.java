package com.johnnsantana.parking_api.repository;

import com.johnnsantana.parking_api.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
