package com.reto3.demo.repository.crud;


import com.reto3.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <Message, Integer>{
    
}
