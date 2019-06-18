package br.com.rocha.dan.api.task.service.impl;

import br.com.rocha.dan.api.task.document.TaskDocument;
import br.com.rocha.dan.api.task.repository.TaskRepository;
import br.com.rocha.dan.api.task.service.TaskService;
import br.com.tasks.model.TaskTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDocument createTask(TaskTO task) {
        return taskRepository.save(TaskDocument.builder()
                .name(task.getName())
                .title(task.getTitle())
                .scheduledDate(task.getDateScheduled().toLocalDateTime())
                .build());
    }
}
