package com.example.springrest_fullstrack_todommvc_vuejs.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Todo,Long> {

}
