package br.com.rocha.dan.api.task.repository;

import br.com.rocha.dan.api.task.document.TaskDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<TaskDocument, String> {

}
