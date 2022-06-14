package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.repository.entity.Task;
import java.util.List;


public interface TaskService {
    //save method is for 2 purposes - Create new item & Update existing item
    Task save(Task task);

    //Delete item from database - based on Title
    void delete(int taskId);

    //Read all item from database
    List<Task> all();

    //Read an item from database - based on task Id
    Task findById( int taskId );


}
