package org.example.models;

public class Activity {
    private int id;
    private String title;
    private boolean completed;

    public Activity(int id, String title) {
        this.title = title;
        this.completed = false;
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (this.completed? "[X]  ": "[ ]  " )+ title ;
    }
}
