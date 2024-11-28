package com.syahrul_ssh.learn_java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syahrul_ssh.learn_java.model.Person;
import com.syahrul_ssh.learn_java.service.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/persons")
public class PersonController {
  @Autowired
  private PersonService personService;

  @GetMapping()
  public List<Person> getAllPersons() {
      return personService.findAll();
  }

  @GetMapping("/{id}")
  public Person getPersonById(@PathVariable Long id) {
      return personService.findById(id).orElseThrow();
  }

  @PostMapping()
  public Person createPerson(@RequestBody Person person) {
      return personService.save(person);
  }

  @PutMapping("{id}")
  public Person personUpdate(@PathVariable String id, @RequestBody Person personDetails) {
      return personService.updatePerson(Long.parseLong(id), personDetails);
  }

  @DeleteMapping("{id}")
  public void deletePerson(@PathVariable Long id) {
      personService.deleteById(id);
  }
}
