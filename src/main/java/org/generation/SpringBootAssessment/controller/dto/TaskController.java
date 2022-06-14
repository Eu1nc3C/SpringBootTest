package org.generation.SpringBootAssessment.controller.dto;


import org.generation.SpringBootAssessment.repository.entity.Task;
import org.generation.SpringBootAssessment.controller.dto.TaskDto;



import org.generation.SpringBootAssessment.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.*;
import java.io.*;


@RestController
@RequestMapping("/item")

public class TaskController {






    final TaskService taskService;

    public TaskController( @Autowired TaskService taskService )
    {
        this.taskService = taskService;
    }


    @CrossOrigin
    @GetMapping( "/all" )
    public Iterable<Task> getTasks()
    {
        return taskService.all();
    }


    @CrossOrigin
    @GetMapping( "/{id}" )
    public Task findTaskById( @PathVariable Integer taskId )
    {
        return taskService.findById( taskId );
    }


    @CrossOrigin
    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer taskId )
    {
        taskService.delete( taskId );
    }



    @CrossOrigin
    @PostMapping("/add")
    public void save(  @RequestParam(name="Title", required = true) String Title,
                       @RequestParam(name="description", required = true) String Description,
                       @RequestParam(name="TargetDate", required = true) String TargetDate){


        TaskDto taskDto = new TaskDto(Title, Description, TargetDate);
        taskService.save(new Task(taskDto));
    }
}