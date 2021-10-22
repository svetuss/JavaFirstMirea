package ru.mirea.task12.Sort2;

public class Student {
    int id, scores;

    public Student(int id, int scores) {
        this.id = id;
        this.scores = scores;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public String toString() {
        return " Student, id = " + id + ", final scores = " + scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
