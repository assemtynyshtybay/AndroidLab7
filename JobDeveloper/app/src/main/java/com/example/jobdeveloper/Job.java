package com.example.jobdeveloper;

public class Job {
    int photo;
    String name;
    String description;
    String date;
    public Job(int ph,String name, String desc, String date){
        photo=ph;
        this.name=name;
        description=desc;
        this.date=date;
    }
    public Job(String name, String desc, String date){
        this.name=name;
        description=desc;
        this.date=date;
    }
    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
