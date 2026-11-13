package li.fleer.tasks.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import li.fleer.tasks.task.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}