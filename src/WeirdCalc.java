import java.util.Scanner;

public class WeirdCalc {

    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    double calc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a i b.");
        a = input.nextDouble();
        b = input.nextDouble();
        if (a > b) {
            c= a+b;
            System.out.println(a + " + " + b + " = " + c);
            return c;

        } else if (a < b) {
            c = a*b;
            System.out.println(a + " * " + b + " = " + c);
            return c;
        } else
            c = a*b;
            System.out.println(a + " * " + b + " = " + c);
            return c;
    }

}


