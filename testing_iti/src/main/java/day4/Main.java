package day4;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println(Person.organisation);
        System.out.println(student1.getStudentID());
        student1.singUp();
        student1.logIn();
        Teacher teacher1 = new Teacher();
        teacher1.singUp();
        teacher1.logIn();
        teacher1.studentAddGrade(student1, 1);
        teacher1.showNumOfStudent();
        student1.studentShowGrade();
        Manager manager1 = new Manager();
        manager1.singUp();
        manager1.logIn();
        manager1.setSalaryForTeacher(teacher1);
        teacher1.showSalary();
    }
}
