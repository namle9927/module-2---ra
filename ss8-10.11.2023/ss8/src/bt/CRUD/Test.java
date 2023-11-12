package bt.CRUD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        Student h1 = new Student(1, "Nam", 9.9);
        Student h2 = new Student(2, "La", 7.8);
        Student h3 = new Student(3, "Lo", 5.7);
        studentManagement.addStudent(h1);
        studentManagement.addStudent(h2);
        studentManagement.addStudent(h3);

        System.out.println("----QLSV-----");
        System.out.println("1.Hien thi");
        System.out.println("2.Them");
        System.out.println("3.Sua");
        System.out.println("4.Xoa");
        System.out.println("5.Tim kiem sinh vien theo id");
        System.out.println("6.Diem trung binh tat ca sinh vien");
        System.out.println("7.Sap xep sinh vien theo diem tang dan");
        System.out.println("8.Thoat");
        System.out.println(" hay nhap lua chon cua ban");
        boolean cont = true;
        do {
            System.out.println("Chọn chức năng : [1- 8]");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    if (studentManagement.getALl().isEmpty()) {
                        System.out.println("Chua co sinh vien nao");
                    } else {
                        for (int i = 0; i < studentManagement.getALl().size(); i++) {
                            System.out.println(studentManagement.getALl().get(i).toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("hay nhap id sinh vien");
                    Student h = new Student();
                    h.setStudentId(sc.nextInt());
                    System.out.println("hay nhap ten sinh vien");
                    sc.nextLine();
                    h.setName(sc.nextLine());
                    System.out.println("hay nhap diem trung binh sinh vien");
                    h.setAvegareScore(Double.parseDouble(sc.nextLine()));
                    studentManagement.addStudent(h);
                    System.out.println("them thanh cong");
                    break;
                case 3:
                    System.out.println("Nhap id can sua");
                    int idEdit = sc.nextInt();
                    Student newStudentInfo = new Student();
                    newStudentInfo.setStudentId(idEdit);
                    System.out.println("hay nhap ten sinh vien");
                    sc.nextLine();
                    newStudentInfo.setName(sc.nextLine());
                    System.out.println("hay nhap diem trung binh sinh vien");
                    newStudentInfo.setAvegareScore(Double.parseDouble(sc.nextLine()));
                    studentManagement.updateStudent(newStudentInfo);
                    break;
                case 4:
                    System.out.println("Nhap id can xoa");
                    int id = sc.nextInt();
                    studentManagement.deleteById(id);
                    System.out.println("xoa thanh cong");
                    break;
                case 5:
                    System.out.println("Nhap id can tim kiem");
                    int idFind = sc.nextInt();
                    if (studentManagement.findById(idFind) == null){
                        System.out.println("không tìm thấy sinh viên");
                    }else System.out.println(studentManagement.findById(idFind));
                    break;
                case 6:
                    System.out.println(studentManagement.getAverageScore());
                    break;
                case 7:
                    studentManagement.sortByScore();
                    System.out.println("ket qua sap xep la");
                    for (int i = 0; i < studentManagement.getALl().size() ; i++) {
                        System.out.println(studentManagement.getALl().get(i));
                    }
                    break;
                case 8:
                    System.out.println("Tạm biệt");
                    cont = false;
                    break;
                default:

                    System.exit(0);
                    break;
            }
        } while (cont);

    }
}
