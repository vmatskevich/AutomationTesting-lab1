package by.matskevich.entity;

import java.util.List;
import by.matskevich.entity.Subject;

/**
 * Created by Vika on 14.09.2017.
 */
public class Faculty {
    private String facultyName;
    private List<Group> groups;
    public double averageMark;

    public Faculty(String facultyName, List<Group> groups) {
        this.facultyName = facultyName;
        this.groups = groups;
        this.averageMark = calculateAverageMark();

    }


    public double calculateAverageMark(){
        double averageMark = 0;
        int count=0;
        for(Group group: groups){
            averageMark += group.getAverageMark();
            count++;
        }
        return averageMark/count;
    }


    public String getFacultyName() {
        return facultyName;
    }


    public List<Group> getGroups() {
        return groups;
    }

    public double getAverageMark() { return averageMark; }

}
