import java.util.Scanner;

import Student.StudentData;
import Student.Base.Student;

public class Main {
    public static void main(String[] args) {
        StudentData st = new StudentData();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********************" +
                    "\n1)Добавить ученика" +
                    "\n2)Удалить ученика" +
                    "\n3)Информация об ученеке" +
                    "\n4)Ученики класса" +
                    "\n5)Общее количество учеников" +
                    "\n6)Выход" +
                    "\n********************");
            String menu = sc.next();
            if (menu.equals("1")) {
                System.out.println("Имя ученка: ");
                String name = sc.next();
                System.out.println("Фамилия ученика");
                String secondName = sc.next();
                System.out.println("Адрес проживания");
                String adres = sc.next();
                System.out.println("Номер класса");
                String ID = sc.next();
                Student student = new Student(name, secondName, adres, ID);
                st.addStudent(student);
            }
            if (menu.equals("2")) {
                System.out.println("Фамилия ученика");
                int secondName = sc.nextInt();
                st.removeStudent(secondName - 1);

            }
            if (menu.equals("3")) {
                System.out.println("Фамилия ученика");
                String secondName = sc.next();
                st.search(secondName);

            }
            if (menu.equals("4")) {
                System.out.println("Введите номер класса");
                String ID = sc.next();
                st.getInfoAllStudentClass(ID);

            }
            if (menu.equals("5")) {
                System.out.println(st.getNumStudent());
            }

            if (menu.equals("6")) {
                break;
            }
        }
    }
}