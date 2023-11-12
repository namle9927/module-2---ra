package bt.CRUD;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double avegareScore;



    public Student() {
    }

    public Student(int studentId, String name, double avegareScore) {
        this.studentId = studentId;
        this.name = name;
        this.avegareScore = avegareScore;
    }

    public double getAvegareScore() {
        return avegareScore;
    }

    public void setAvegareScore(double avegareScore) {
        this.avegareScore = avegareScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", avegareScore=" + avegareScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if(this.getAvegareScore() > o.getAvegareScore()){
//            return 1;
//        } else if (this.getAvegareScore() == o.getAvegareScore()) {
//            return 0;
//        }else {
//            return -1;
//        }
        return (int)(this.getAvegareScore()*100) - (int)(o.getAvegareScore()*100);
    }
}

