package functionInJava;

public class SalaryChallenge {

    public static double salaryCalculation(double workingHoursPerWeek, double moneyPerHour, double vacantionDays){

        return (workingHoursPerWeek * moneyPerHour *52)-(vacantionDays*moneyPerHour*8);
    }
    public static void main(String[] args) {

        System.out.println(salaryCalculation(40,15,8) + " USD is one year salary");

    }
}
