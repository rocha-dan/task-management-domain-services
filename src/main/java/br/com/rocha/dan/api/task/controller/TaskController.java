package br.com.rocha.dan.api.task.controller;


import br.com.rocha.dan.api.task.service.TaskService;
import br.com.rocha.dan.api.task.util.TaskBuilder;
import br.com.tasks.api.TasksApi;
import br.com.tasks.model.TaskResponseTO;
import br.com.tasks.model.TaskTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TaskController implements BaseController, TasksApi {

    @Autowired
    private TaskService taskService;

    @Override
    public ResponseEntity<TaskResponseTO> createTask(@Valid @RequestBody TaskTO task) {

      return ResponseEntity
              .status(201)
              .body(TaskBuilder.builder().convertToTaskResponseTO(taskService.createTask(task))) ;
    }
}
