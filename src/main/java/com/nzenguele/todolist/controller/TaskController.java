package com.nzenguele.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nzenguele.todolist.domain.Task;
import com.nzenguele.todolist.service.impl.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    // Create
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    List<Task> create(@RequestBody Task task) {
        return this.taskService.save(task);
    }

    // Read
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<Task> read() {
        return this.taskService.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<Task> getOne(@PathVariable Long id) {
        Optional<Task> task = this.taskService.findById(id);
        if (task.isPresent()) {
            return ResponseEntity.ok().body(task.get());
        }
        return ResponseEntity.notFound().build();
    }

    // Update
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    List<Task> update(@PathVariable Long id, @RequestBody Task task) {
        return this.taskService.save(task);
    }

    // Delete
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    List<Task> remove(@PathVariable Long id) {
        return this.taskService.delete(id);
    }

}
