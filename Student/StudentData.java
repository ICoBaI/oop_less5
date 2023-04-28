package Student;

import java.util.ArrayList;
import java.util.List;

import Student.Base.Student;

public class StudentData {
    private List<Student> students;

    public StudentData() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Ученик добавлен");
    }

    public void removeStudent(int index) {
        students.remove(index);
        System.out.println("Ученик удален");
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public int getNumStudent() {
        return students.size();
    }

    public void getInfoAllStudentClass(String item){
        for (Student studentBase : students) {
            if(studentBase.scClase().equals(item)){
                System.out.println(studentBase.getInfo());
            }
        }
    }

    public void search (String item) {
        for (Student studentBase : students) {
            if(studentBase.secondName().equals(item)){
                System.out.println(studentBase.getInfo());
            }
        }
    }
}
