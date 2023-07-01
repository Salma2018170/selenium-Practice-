package day4;

import java.util.Scanner;

public class Manager extends Person {
    protected String trackName;
    Scanner scanner = new Scanner(System.in);
    Teacher teacher;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSalaryForTeacher(Teacher teacher) {
        int salaryTeacher;
        System.out.println("Please enter Teacher Salary for " + teacher.name);
        salaryTeacher = scanner.nextInt();
        teacher.setSalary(salaryTeacher);
    }

    public void singUp() {
        System.out.println("HI You will sing up as Manager");
        System.out.println("please Enter Your full name");
        name = scanner.next();
        System.out.println("please Enter Your Email");
        email = scanner.next();
        System.out.println("please Enter Your phone");
        phoneNumber = scanner.nextInt();
        System.out.println("Please Enter Your branch name");
        branchName = scanner.next();
        System.out.println("Please Enter the track you are manage ");
        trackName = scanner.next();
        System.out.println("please Enter Your password");
        setPassword(scanner.next());
        //scanner.close();
    }

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
}
