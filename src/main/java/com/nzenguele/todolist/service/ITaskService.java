package com.nzenguele.todolist.service;

import com.nzenguele.todolist.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITaskService {

    public List<Task> save(Task task);

    public List<Task> findAll();

    public Optional<Task> findById(Long id);

    public List<Task> delete(Long taskID);

}
