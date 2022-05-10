package ru.yandex.hw5.service;

import ru.yandex.hw5.model.Subtask;
import ru.yandex.hw5.model.Task;

import java.util.List;

public interface TaskManager {
    List<Task> getHistory();

    void addSubtask(Subtask subtask);

    // add, get, update, delete
}
