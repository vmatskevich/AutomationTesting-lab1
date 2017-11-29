package by.matskevich.entity;

import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import by.matskevich.entity.*;

/**
 * Created by Vika on 14.09.2017.
 */
public class Student {
    private String studentFirstName;
    private String studentLastName;
    private int studentID;
    private Map<Subject, int[]> subjects ;
    public double averageMark;


    public Student(String studentFirstName, String studentLastName, int studentID, Map<Subject, int[]> subjects) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentID = studentID;
        this.subjects = new HashMap<Subject, int[]>(subjects);
        this.averageMark = calculateStudentMarks();

    }
    public double calculateStudentMarks() {
        if (!subjects.isEmpty()) {
            double sum = 0;
            int count=0;
            for (int[] mark: subjects.values()) {
                for (int i=0;i<mark.length;i++) {
                    System.out.print(mark[i]);
                    sum += mark[i];
                    count++;
                }
            }
            return sum / count;
        }
        return 0;
    }

    public Map<Subject, int[]> getMarks() {
        return subjects;
    }



    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

}
