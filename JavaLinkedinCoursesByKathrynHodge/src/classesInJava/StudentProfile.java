package classesInJava;

public class StudentProfile {

    public String firstName;



    public String lastName;
   public int expectedYearToGraduate;
    double gpa;

    String declaredMajor;

    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double gpa, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }


    public int incrementStudentGraduateYear(){
        return this.expectedYearToGraduate+1;
    }
}
