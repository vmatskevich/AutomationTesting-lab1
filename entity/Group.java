package by.matskevich.entity;


import java.util.*;

/**
 * Created by Vika on 14.09.2017.
 */
public class Group {
    private int groupID;
    private List<Student> students = Collections.emptyList();;
    public double averageMark;

    public Map<Student, Double> averageMarkBySubject = Collections.emptyMap();


    public Group(int groupID, List<Student> students) {
        this.groupID = groupID;
        this.students = new ArrayList<>(students);
        this.averageMark = calculateAverageMarkOfGroup();

    }

    public double calculateAverageMarkOfGroup() {
        double averageMark = 0;
        if (!students.isEmpty()){
            for(Student student: students){
                averageMark += student.getAverageMark();
            }
            return averageMark / students.size();
        }
        return 0;
    }

  /*  public Map<Student, Double> calculateAverageMarkBySubject() {
        Map<Student, Double> averageMarksBySubject = new HashMap<>();
        if (!students.isEmpty()){
            for(Student student: subjects.getSubjects()){
                    double markBySubject = student.getMarkBySubject(subject);
                    if (averageMarksBySubject.containsKey(subject)){
                        double mark = averageMarksBySubject.get(subject) + markBySubject;
                        averageMarksBySubject.put(subject, mark);
                    } else {
                        averageMarksBySubject.put(subject, markBySubject);
                    }
                }
            }

            for (Subject subject: averageMarksBySubject.keySet()){
                averageMarksBySubject.put(subject, averageMarksBySubject.get(subject) / students.size());
            }
        return  averageMarksBySubject;
    }*/

    public double getAverageMark() {
        return averageMark;
    }

    public int getGroupID() {
        return groupID;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
