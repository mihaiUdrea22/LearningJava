import classesInJava.StudentProfile;
import classesInJava.Triangle;

public class Main {

    public static void main(String[] args) {
        /*int studentAge = 15;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Kayla";
        String studentLastName = "Hummon";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        System.out.println(studentFirstName +" " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("How do you want to update GPA?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

*/

        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,3);
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println(triangleA.base);
        System.out.println(Triangle.ax);

        StudentProfile student1 = new StudentProfile("John","Doe",
                2022,3.76,"Bsc");
       /* StudentProfile student2 = new StudentProfile("John2","Doe2",
                2023,4.76,"Bsc");*/

        System.out.println("Student1 expected graduation year was "+ student1.expectedYearToGraduate + " but now is " + student1.incrementStudentGraduateYear());

    }


}
