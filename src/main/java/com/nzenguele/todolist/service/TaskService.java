package com.nzenguele.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nzenguele.todolist.domain.Task;
import com.nzenguele.todolist.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    // C - Create // U - Update
    public List<Task> save(Task task) {
        taskRepository.save(task);
        return findAll();
    }

    // R - Read
    public List<Task> findAll() {
        Sort sort = Sort.by("priority").and(Sort.by("name"));
        return taskRepository.findAll(sort);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).get();
    }

    // D - Delete
    public List<Task> delete(Long taskID) {
        this.taskRepository.deleteById(taskID);
        return findAll();
    }

}
