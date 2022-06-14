package org.generation.SpringBootAssessment.repository;
import org.springframework.data.repository.*;
import org.generation.SpringBootAssessment.repository.entity.Task;

public interface TaskRepository extends CrudRepository <Task, Integer>
{
}
