package uk.ac.belfastmet.topTen.repository;

import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.topTen.domain.ToDo;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ToDoRepo extends CrudRepository<ToDo, Long> {

}
