package by.matskevich.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import by.matskevich.entity.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * Created by Vika on 14.09.2017.
 */
public class Main {


    public static void main(String[] args) {
        Map<Subject, int[]> subjects = new HashMap<>();
        subjects.put(Subject.Programming,new int[]{8,8,8});
        subjects.put(Subject.Mathematics,new int[]{7,9,8});
        subjects.put(Subject.English,new int[]{7,5,8});
        Student student1 = new Student("Ivan","Petrov",1502, subjects);

     subjects.put(Subject.Programming,new int[]{8,7,8});
     subjects.put(Subject.Mathematics,new int[]{7,2,8,10});
     subjects.put(Subject.English,new int[]{7,8});
     Student student2 = new Student("Kate","Kuznecova",1505, subjects);

     subjects.put(Subject.Programming,new int[]{6,2});
     subjects.put(Subject.Mathematics,new int[]{5,8,7});
     subjects.put(Subject.English,new int[]{6,6,10});
     Student student3 = new Student("Petr","Vasechkin",1510, subjects);

     subjects.put(Subject.Programming,new int[]{9,10});
     subjects.put(Subject.Mathematics,new int[]{8,9,8});
     subjects.put(Subject.English,new int[]{7,8});
     Student student4 = new Student("Vadim","Belko",1508, subjects);


        List<Student> students1 = new ArrayList<>();
     students1.add(student1);
     students1.add(student2);
     students1.add(student3);
        Group group1 = new Group(2,students1);

     List<Student> students2 = new ArrayList<>();
     students2.add(student4);
     Group group2 = new Group(9,students2);


        List<Group> groups1 = new ArrayList<>();
     groups1.add(group1);
     groups1.add(group2);
        Faculty faculty = new Faculty("MMF", groups1);

        List<Faculty> faculties = new ArrayList<>();
     faculties.add(faculty);
        University university = new University("BSU", faculties);

        System.out.println("Student average mark: ");
        System.out.printf("%.2f",student1.getAverageMark());System.out.println(" - "+student1.getStudentFirstName()+' '+student1.getStudentLastName());
        System.out.printf("%.2f",student2.getAverageMark());System.out.println(" - "+student2.getStudentFirstName()+' '+student2.getStudentLastName());
        System.out.printf("%.2f",student3.getAverageMark());System.out.println(" - "+student3.getStudentFirstName()+' '+student3.getStudentLastName());
        System.out.printf("%.2f",student4.getAverageMark()); System.out.println(" - "+student4.getStudentFirstName()+' '+student4.getStudentLastName());


        System.out.println("Group average mark: ");
        System.out.printf("%.2f",group1.getAverageMark()); System.out.println(" - "+"Group "+group1.getGroupID());
        System.out.printf("%.2f",group2.getAverageMark());System.out.println(" - "+"Group "+group2.getGroupID());
        System.out.println("Faculty average mark: ");
        System.out.printf("%.2f",faculty.getAverageMark());System.out.println(" - "+faculty.getFacultyName());
        System.out.println("University average mark: ");
        System.out.printf("%.2f",university.calculateAverageMark());

    }
}
