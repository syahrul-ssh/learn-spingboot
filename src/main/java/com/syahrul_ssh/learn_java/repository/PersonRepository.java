package com.syahrul_ssh.learn_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syahrul_ssh.learn_java.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
  
}
