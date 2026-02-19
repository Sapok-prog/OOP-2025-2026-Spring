package Lab_1.p4;
import practice_2.Student;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        Course course = new Course("CSCI2106", "Object-Oriented Programming" , 5);

        GradeBook gradeBook = new GradeBook(course);
        gradeBook.displayMessage();

        System.out.println("Please, input grades for students: ");

        Student student1 = new Student("Amina" , 24031628);
        System.out.print(student1.getName() + " : ");
        int grade = console.nextInt();
        gradeBook.setGrade(student1 , grade);

        Student student2 = new Student("Sanzhar" , 24031852);
        System.out.print(student2.getName() + " : ");
        grade = console.nextInt();
        gradeBook.setGrade(student2 , grade);

        Student student3 = new Student("Elsa" , 24031741);
        System.out.print(student3.getName() + " : ");
        grade = console.nextInt();
        gradeBook.setGrade(student3 , grade);

        gradeBook.displayGradeReport();


    }
}
