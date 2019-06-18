package br.com.rocha.dan.api.task.util;

import br.com.rocha.dan.api.task.document.TaskDocument;
import br.com.tasks.model.TaskResponseTO;


public class TaskBuilder {

    public static TaskBuilder builder(){
        return new TaskBuilder();
    }

    public TaskResponseTO convertToTaskResponseTO(TaskDocument taskDocument){
        TaskResponseTO response = new TaskResponseTO();
        response.setId(taskDocument.getId());
        return response;

    }
}
