package br.com.rocha.dan.api.task.handler;

public interface Command<T> {

    void setResult(T result);

    T getResult();
}
