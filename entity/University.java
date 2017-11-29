package by.matskevich.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vika on 17.09.2017.
 */
public class University {
    private String name;
    private List<Faculty> faculties;
    public double averageMark;

    public University (String name, List<Faculty> faculties){
        this.name = name;
        this.faculties = new ArrayList<>(faculties);
        this.averageMark = calculateAverageMark();
    }

    public double calculateAverageMark(){
        double averageMark = 0;
        int count=0;
        for(Faculty faculty: faculties){
            averageMark += faculty.getAverageMark();
            count++;
        }
        return averageMark/count;
    }
}
