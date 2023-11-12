package bt.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }
    public List<Student> getALl(){
        return students;
    }
    public void addStudent (Student a){
        students.add(a);
    }
    public Student findById(int id){
        for (Student s:students) {
            if(s.getStudentId()==id){
                return s;
            }
        }
        return null;
    }

    public void updateStudent(Student s){
        students.set(students.indexOf(findById(s.getStudentId())),s);
    }
    public void deleteById(int id){
        students.remove(findById(id));
    }
    public double getAverageScore() {
        double avg = 0;
        for (Student s : students
        ) {
            avg += s.getAvegareScore();
        }
        return avg/students.size();
    }
    public void sortByScore(){
        Collections.sort(students);
    }

}
