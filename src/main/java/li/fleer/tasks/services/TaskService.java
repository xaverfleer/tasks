package li.fleer.tasks.services;

import java.util.List;

import org.springframework.stereotype.Service;

import li.fleer.tasks.dto.TaskDto;

@Service
public class TaskService {

    public TaskService() {
    }

    public List<TaskDto> getTasks() {
        return List.of(new TaskDto(1L, "Hello, world!!"));
    }

}