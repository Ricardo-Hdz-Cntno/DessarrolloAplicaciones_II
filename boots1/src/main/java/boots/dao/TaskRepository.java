package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
