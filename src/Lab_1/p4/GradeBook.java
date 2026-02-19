package Lab_1.p4;
import practice_2.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GradeBook {

    private Map<String , String> gradesDisturb;
    private Course course;
    private Map<Student , Integer> studentList;

    public GradeBook(Course course){

        this.course = course;
        studentList = new HashMap<>();
        gradesDisturb = new LinkedHashMap<>();

        gradesDisturb.put("00-09", "");
        gradesDisturb.put("10-19", "");
        gradesDisturb.put("20-29", "");
        gradesDisturb.put("30-39", "");
        gradesDisturb.put("40-49", "");
        gradesDisturb.put("50-59", "");
        gradesDisturb.put("60-69", "");
        gradesDisturb.put("70-79", "");
        gradesDisturb.put("80-89", "");
        gradesDisturb.put("90-99", "");
        gradesDisturb.put("100", "");

    }

    public void setGrade(Student student , int grade){

        studentList.put(student , grade);

    }

    private Student getMaxGrade(){

        int max = Integer.MIN_VALUE;
        Student result = null;

        for(Student student : studentList.keySet()){

            if(studentList.get(student) > max){

                result = student;
                max = studentList.get(student);

            }

        }return result;
    }

    private Student getMinGrade(){

        int min = Integer.MAX_VALUE;
        Student result = null;

        for(Student student : studentList.keySet()){

            if(studentList.get(student) < min){

                result = student;
                min = studentList.get(student);

            }

        }return result;

    }

    private double getAvgGrade(){

        double sum = 0;
        double count = studentList.size() * 1.0;

        for(Integer grade : studentList.values()){

            sum += grade;

        }

        return sum / count;

    }

    private void setGradesDisturb(){

        for(Integer grade : studentList.values()){

            if (grade >= 0 && grade <= 9) {
                gradesDisturb.put("00-09", gradesDisturb.getOrDefault("00-09", "") + "*");
            } else if (grade >= 10 && grade <= 19) {
                gradesDisturb.put("10-19", gradesDisturb.getOrDefault("10-19", "") + "*");
            } else if (grade >= 20 && grade <= 29) {
                gradesDisturb.put("20-29", gradesDisturb.getOrDefault("20-29", "") + "*");
            } else if (grade >= 30 && grade <= 39) {
                gradesDisturb.put("30-39", gradesDisturb.getOrDefault("30-39", "") + "*");
            } else if (grade >= 40 && grade <= 49) {
                gradesDisturb.put("40-49", gradesDisturb.getOrDefault("40-49", "") + "*");
            } else if (grade >= 50 && grade <= 59) {
                gradesDisturb.put("50-59", gradesDisturb.getOrDefault("50-59", "") + "*");
            } else if (grade >= 60 && grade <= 69) {
                gradesDisturb.put("60-69", gradesDisturb.getOrDefault("60-69", "") + "*");
            } else if (grade >= 70 && grade <= 79) {
                gradesDisturb.put("70-79", gradesDisturb.getOrDefault("70-79", "") + "*");
            } else if (grade >= 80 && grade <= 89) {
                gradesDisturb.put("80-89", gradesDisturb.getOrDefault("80-89", "") + "*");
            } else if (grade >= 90 && grade <= 99) {
                gradesDisturb.put("90-99", gradesDisturb.getOrDefault("90-99", "") + "*");
            } else if (grade == 100) {
                gradesDisturb.put("100", gradesDisturb.getOrDefault("100", "") + "*");
            }

        }

    }

    public void displayMessage(){

        System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription());

    }


    public void displayGradeReport(){

        System.out.printf("Class average is %.2f. ", getAvgGrade());

        Student lowestGradeStudent = getMinGrade();
        System.out.println("Lowest grade is "
                + studentList.get(lowestGradeStudent)
                + " (" + lowestGradeStudent.toString() + ").");

        Student highestGradeStudent = getMaxGrade();
        System.out.println("Highest grade is "
                + studentList.get(highestGradeStudent)
                + " (" + highestGradeStudent.toString() + ").");

        System.out.println();
        System.out.println("Grades distribution:");

        setGradesDisturb();
        for(String grades : gradesDisturb.keySet()){

            System.out.println(grades + " : " + gradesDisturb.get(grades));

        }gradesDisturb.clear();

    }

}
