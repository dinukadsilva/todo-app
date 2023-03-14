package com.dinukadesilva.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dinukadesilva.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    
    
}
