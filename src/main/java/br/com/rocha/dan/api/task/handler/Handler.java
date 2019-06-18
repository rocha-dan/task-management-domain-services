package br.com.rocha.dan.api.task.handler;

import org.springframework.stereotype.Service;

@Service
public interface Handler<T extends Command> {

    void handle(T command);

}
