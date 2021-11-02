package com.reto3.demo.repository.crud;


import com.reto3.demo.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {

}