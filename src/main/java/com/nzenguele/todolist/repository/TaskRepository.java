package com.nzenguele.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nzenguele.todolist.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
