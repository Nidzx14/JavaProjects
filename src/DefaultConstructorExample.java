import java.util.Scanner;

public class DefaultConstructorExample {
    public static void main(String args[])
    {
        Employee Safa=new Employee();
    }

}
class Employee
{
    int id;
    String name;
    String designation;
    Employee()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name");
        name=input.next();
        System.out.println("Enter the id");
        id=input.nextInt();
        System.out.println("Enter the designaiton");
        designation=input.next();

        System.out.println("The employee's name is "+ name);
        System.out.println("The employee's id is "+ id);
        System.out.println("The employee's designation is "+ designation);
    }

}
