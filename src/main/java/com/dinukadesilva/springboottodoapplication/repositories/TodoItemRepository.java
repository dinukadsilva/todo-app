package com.dinukadesilva.springboottodoapplication.repositories;

import com.dinukadesilva.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;


public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    
    
}
