package li.fleer.tasks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
class TaskController {

    @GetMapping("/")
    public String getTasks() {
        return "hello, world!";
    }

}