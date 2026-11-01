package li.fleer.tasks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import li.fleer.tasks.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}