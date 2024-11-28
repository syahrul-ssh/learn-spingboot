package com.syahrul_ssh.learn_java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syahrul_ssh.learn_java.model.Person;
import com.syahrul_ssh.learn_java.repository.PersonRepository;

@Service
public class PersonService {
  @Autowired
  private PersonRepository personRepository;

  public List<Person> findAll() {
    return personRepository.findAll();
  }

  public Optional<Person> findById(Long id) {
    return personRepository.findById(id);
  }

  public Person save(Person person) {
    return personRepository.save(person);
  }

  public void deleteById(Long id) {
    personRepository.deleteById(id);
  }

  public Person updatePerson(Long id, Person personDetails) {
    Person person = personRepository.findById(id).orElseThrow();
    person.setName(personDetails.getName());
    person.setAge(personDetails.getAge());
    return personRepository.save(person);
}
}
