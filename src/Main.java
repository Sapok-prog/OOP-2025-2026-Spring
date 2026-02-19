import practice_2.StarTriangle;
import practice_2.Student;
import practice_2.Time;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Amina" , 24031628);
//        System.out.println(student1.getName());
//        System.out.println(student1.getId());
//        System.out.println(student1.incrementYearOfStudy());
//        System.out.println(student1.incrementYearOfStudy());
//        Student student2 = new Student("Elsa",24031937);
//        System.out.println(student2.getId());
//        System.out.println(student2.incrementYearOfStudy());
//
//
//        StarTriangle starTriangle = new StarTriangle(3);
//        System.out.println(starTriangle.toString());

        Time sagat = new Time(23,35,59);
        System.out.println(sagat.toUniversal());
        Time tagySagat = new Time(12 , 15 , 16);
        System.out.println(tagySagat.toStandard());
        Time.add(sagat , tagySagat);
        System.out.println(sagat.toStandard());

    }
}