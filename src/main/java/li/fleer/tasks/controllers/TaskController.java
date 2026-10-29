package li.fleer.tasks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import li.fleer.tasks.dto.TaskDto;
import li.fleer.tasks.services.TaskService;

@RestController
@RequestMapping("/api/tasks")
class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public List<TaskDto> getTasks() {
        return this.taskService.getTasks();
    }

}