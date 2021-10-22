package ru.mirea.task12.Sort2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getScores()>b.getScores()) {
            return -1;
        }
        if (a.getScores()<b.getScores()) {
            return 1;
        }
        return 0;
    }
}
