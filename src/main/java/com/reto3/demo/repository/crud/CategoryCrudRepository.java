package com.reto3.demo.repository.crud;


import com.reto3.demo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

}
