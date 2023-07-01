package day4;

import java.util.Scanner;

public class Student extends Person  {


    private static int count = 0;
    protected int grade;
    protected int numOfCourse;
    protected String studentTrack;
    Scanner scanner = new Scanner(System.in);
    private final int studentID;

    Student() {
        count++;
        studentID = count;

    }

    Student(int numOfCourse) {
        this.numOfCourse = numOfCourse;
        count++;
        studentID = count;
    }

    public static int numberOfStudent() {
        return count;
    }

    @Override
    public void singUp() {
        System.out.println("HI You will sing up as Student");
        System.out.println("please Enter Your full name");
        name = scanner.next();
        System.out.println("please Enter Your Email");
        email = scanner.next();
        System.out.println("please Enter Your phone");
        phoneNumber = scanner.nextInt();
        System.out.println("please Enter Your track name");
        studentTrack = scanner.next();
        System.out.println("please Enter Your branch name");
        branchName = scanner.next();
        System.out.println("please Enter Your password");
        setPassword(scanner.next());
        //scanner.close();
    }

    @Override
    public void logIn() {
        String email, password;
        System.out.println("HI You will log in as Student");
        System.out.println("Please enter email");
        email = scanner.next();
        System.out.println("Please enter password");
        password = scanner.next();
        if (email.equals(this.email) && password.equals(getPassword())) {
            System.out.println("You log in successfully! ");
        } else {
            System.out.println("Sorry your email or password not match try again or Sing up!! ");
        }
        // scanner.close();

    }

    public void studentShowGrade() {
        System.out.println("Your Evaluation grade is " + grade);
    }

    public int getStudentID() {
        return studentID;
    }
}
