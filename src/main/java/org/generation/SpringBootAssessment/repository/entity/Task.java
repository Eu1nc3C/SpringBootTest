package org.generation.SpringBootAssessment.repository.entity;

import org.generation.SpringBootAssessment.controller.dto.TaskDto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taskId;
    private String Title;
    private String Description;
    private String TargetDate;


    public Task() {}

    public Task( TaskDto taskDto )
    {
        this.Title = taskDto.getTitle();
        this.Description = taskDto.getDescription();
        this.TargetDate = taskDto.getTargetDate();
    }


    public Integer getTaskId()
    {
        return taskId;
    }

    public void setTaskId( Integer taskId )
    {
        this.taskId = taskId;
    }


    public String getTitle()
    {
        return Title;
    }

    public void setTitle( String Title )
    {
        this.Title = Title;

    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription( String Description )
    {
        this.Description = Description;
    }



    public String getTargetDate()
    {
        return TargetDate;
    }

    public void setTargetDate( String TargetDate )
    {
        this.TargetDate = TargetDate;
    }

    @Override
    public String toString()
    {
        return "Task{"+ "id=" + taskId + ",title=" + Title +  '\'' + ", description='" + Description + '\'' + ", " +
                "taskDate='"
                + TargetDate + '}';
    }

}

