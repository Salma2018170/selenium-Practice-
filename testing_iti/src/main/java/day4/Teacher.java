package day4;

import java.util.Scanner;

public class Teacher extends Person {
    protected String courseTeach;
    protected int numOfStudent;
    Scanner scanner = new Scanner(System.in);
    Student student;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void studentAddGrade(Student student, int studentId) {

        if (studentId == student.getStudentID()) {
            System.out.println("please enter student grade for " + student.name);
            student.grade = scanner.nextInt();
        } else {
            System.out.println("You enter wrong student Id");
        }
    }

    public void singUp() {
        System.out.println("HI You will sing up as Teacher");
        System.out.println("please Enter Your full name");
        name = scanner.next();
        System.out.println("please Enter Your Email");
        email = scanner.next();
        System.out.println("please Enter Your phone");
        phoneNumber = scanner.nextInt();
        System.out.println("please Enter Your course name");
        courseTeach = scanner.next();
        System.out.println("Please Enter Your branch name");
        branchName = scanner.next();
        System.out.println("please Enter Your password");
        setPassword(scanner.next());
        // scanner.close();
    }

    @Override
    public void logIn() {
        String email, password;
        System.out.println("HI You will log in as Teacher");
        System.out.println("Please enter email");
        email = scanner.next();
        System.out.println("Please enter password");
        password = scanner.next();
        if (email.equals(this.email) && password.equals(getPassword())) {
            System.out.println("You log in successfully! ");
        } else {
            System.out.println("Sorry your email or password not match try again or Sing up!! ");
        }
        //scanner.close();

    }

    public void showSalary() {
        System.out.println("Your salary is: " + getSalary());
    }

    public void showNumOfStudent() {
        System.out.println("You teach for student " + Student.numberOfStudent());
    }
}
