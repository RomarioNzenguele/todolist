package com.nzenguele.todolist.service;

import com.nzenguele.todolist.domain.Task;
import com.nzenguele.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITaskService {

    public List<Task> save(Task task);

    public List<Task> findAll();

    public Task findById(Long id);

    public List<Task> delete(Long taskID);

}
