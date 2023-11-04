public class Multilevel_Inheritance {
        int a=10,b=20;
        int result= a*b;
}

class ChildA extends Multilevel_Inheritance{
    int resultA;
    void addA()
    {int c=5;
    resultA= result + c;
        System.out.println("Result A is "+ resultA);
    }
}

class ChildB extends ChildA {
    public static void main(String args[]) {
        ChildA cA = new ChildA();
        cA.addA();
            int d = 10;
            int resultB = cA.resultA / d;
            System.out.println("Result B is " + resultB);
        }
    }
