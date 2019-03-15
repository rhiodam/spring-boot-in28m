package com.rhiodamuthie.springbootin28m.repository;

import com.rhiodamuthie.springbootin28m.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
