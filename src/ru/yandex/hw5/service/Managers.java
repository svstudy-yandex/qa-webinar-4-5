package ru.yandex.hw5.service;

public class Managers {
    public static TaskManager getDefault() {
        //return new InMemoryTaskManager();
        return new FileBackedTaskManager("resources/tasks.csv");
    }

    public static HistoryManager getDefaultHistory() {
        return new InMemoryHistoryManager();
    }
}
