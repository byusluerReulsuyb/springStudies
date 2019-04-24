package com.byusluer.spring.myfirstspringdemo.repositories;

import com.byusluer.spring.myfirstspringdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
