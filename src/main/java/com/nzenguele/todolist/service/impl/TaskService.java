package com.nzenguele.todolist.service.impl;

import java.util.List;

import com.nzenguele.todolist.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nzenguele.todolist.domain.Task;
import com.nzenguele.todolist.repository.TaskRepository;

@Service
public class TaskService implements ITaskService {

    @Autowired
    TaskRepository taskRepository;

    // C - Create // U - Update
    @Override
    public List<Task> save(Task task) {
        taskRepository.save(task);
        return findAll();
    }

    // R - Read
    @Override
    public List<Task> findAll() {
        Sort sort = Sort.by("priority").and(Sort.by("name"));
        return taskRepository.findAll(sort);
    }
    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).get();
    }

    // D - Delete
    @Override
    public List<Task> delete(Long taskID) {
        this.taskRepository.deleteById(taskID);
        return findAll();
    }



}
