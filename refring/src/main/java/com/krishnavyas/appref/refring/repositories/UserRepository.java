package com.krishnavyas.appref.refring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishnavyas.appref.refring.Authentication.User;

public interface UserRepository extends JpaRepository<User, Integer>{


}
