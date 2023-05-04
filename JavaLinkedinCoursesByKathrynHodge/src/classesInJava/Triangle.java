package classesInJava;

public class Triangle {
    public double base;
    public double height;
    public double sideLenOne;
    public double sideLenTwo;
    public double sideLenThree;
    public static int ax = 2;

    public Triangle(double base, double height, double sideLenOne,
             double sideLenTwo, double sideLenThree){

        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;


    }


    public double findArea(){
        return (this.base * this.height)/2;
    }

}
