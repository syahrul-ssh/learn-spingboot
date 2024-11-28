package com.syahrul_ssh.learn_java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private int age;

  // constructor, getters and setters
  public Person() {}

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  // standard getter and setter
}
