public class method_overloading {
    public int multiply(int a, int b, int c) {
        int product = a * b * c;
        return product;
    }

    public double multiply(double a, double b, double c) {
        double pdouble = a * b * c;
        return pdouble;
    }

public static void main(String[] args){
    method_overloading mthdover = new method_overloading();
    int product = mthdover.multiply(20,30,40);
    double pdouble=mthdover.multiply(50.3,2.5,3.2);
    System.out.println(product);
    System.out.println(pdouble);
}
}