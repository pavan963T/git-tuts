package com.GratsTech2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GratsTech2.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
