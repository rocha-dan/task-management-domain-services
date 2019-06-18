package br.com.rocha.dan.api.task.service;

import br.com.rocha.dan.api.task.document.TaskDocument;
import br.com.tasks.model.TaskTO;

public interface TaskService {

    TaskDocument createTask(TaskTO task);
}
