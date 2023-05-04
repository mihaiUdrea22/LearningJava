package functionInJava;

public class MealPrice {

    public static double calculatedTotalMealPrice(double listedMealPrice, double tipRate,
                                                double taxRate){

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        //System.out.println("Your meal price is: " + result);

        return listedMealPrice + tip + tax;

    }
    public static void main(String[] args) {


        double groupTotalMealPrice = calculatedTotalMealPrice(100,.2,.08);
        //calculatedTotalMealPrice(25,.18,.08);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);
    }
}
