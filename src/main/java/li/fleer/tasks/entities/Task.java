package li.fleer.tasks.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import li.fleer.tasks.dto.TaskDto;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    public Task() {
    }

    public Task(String title) {
        this.title = title;
    }

    public TaskDto toDto() {
        return new TaskDto(this.id, this.title);
    }
}