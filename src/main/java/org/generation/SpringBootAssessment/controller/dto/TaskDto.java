package org.generation.SpringBootAssessment.controller.dto;

public class TaskDto {

    private String Title;
    private String Description;
    private String TargetDate;


    public TaskDto( String Title, String Description, String TargetDate )
    {
        this.Title = Title;
        this.Description = Description;
        this.TargetDate = TargetDate;
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



}
