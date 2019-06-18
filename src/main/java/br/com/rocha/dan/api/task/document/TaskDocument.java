package br.com.rocha.dan.api.task.document;


import java.io.Serializable;
import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
@Document(collection = "Task")
public class TaskDocument implements Serializable {

    private static final long serialVersionUID = -63100486316520040L;

    @Id
    private String id;
    private String title;
    private String name;
    private LocalDateTime scheduledDate;


}
