class Parent1 {
    int a= 10, b=20;
    void display()
    {
        System.out.println("Value of a is "+ a);
        System.out.println("Value of b is "+ b);
    }
}

class Child1 extends Parent1
{
    void add()
    {
        int c = a+b;
        System.out.println("Result is "+c);
    }
}

public class InheritanceExample2
    {
        public static void main(String[] args){
            Child1 c=new Child1();
        c.display();
        c.add();
    }
}