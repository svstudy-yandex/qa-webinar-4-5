package ru.yandex.hw5.service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import ru.yandex.hw5.model.Subtask;
import ru.yandex.hw5.model.Task;

public class FileBackedTaskManager extends InMemoryTaskManager {

    // public FileBackedTaskManager(File file)
    // public FileBackedTaskManager(Path path)
    public FileBackedTaskManager(String filePath) {

    }

    @Override
    public void addSubtask(Subtask subtask) {
        super.addSubtask(subtask);
        save();
    }

    private void save() {
        // ...
    }

    public static FileBackedTaskManager loadFromFile(String file) {
                                                  // Path file
                                                  // String file

        try (FileReader fr = new FileReader(file)) {
            // ...
        } catch (IOException e) {
            throw new ManagerSaveException(e.getMessage());
        }
        // ...

        // throw new ManagerSaveException(...);
        return null;
    }

    static void main(String[] args) {
        //...
        // TaskManager restoredManager = loadFromFile(...);
        // ...
    }
}
