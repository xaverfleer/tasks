package li.fleer.tasks.task.services;

import java.util.List;

import org.springframework.stereotype.Service;

import li.fleer.tasks.task.dto.CreateTaskRequest;
import li.fleer.tasks.task.dto.TaskDto;
import li.fleer.tasks.task.entities.Task;
import li.fleer.tasks.task.repositories.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<TaskDto> getTasks() {
        return this.taskRepository.findAll().stream().map(t -> t.toDto()).toList();
    }

    public TaskDto createTask(CreateTaskRequest req) {
        Task task = this.taskRepository.save(new Task(req.title()));
        return task.toDto();
    }

}