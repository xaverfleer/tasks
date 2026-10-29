package li.fleer.tasks.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public TaskService() {
    }

    public List<String> getTasks() {
        return List.of("Hello, ", "world!!");
    }

}