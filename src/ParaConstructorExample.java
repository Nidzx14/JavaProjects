public class ParaConstructorExample {
    public static void main (String args[])
    {
        Employee1 Safa= new Employee1(1,"Safa","CEO");
    }
}

class Employee1
{
    int id;
    String name, designation;

    Employee1(int eid, String ename, String edesignation)
    {
        id=eid;
        name=ename;
        designation=edesignation;
        System.out.println("The employee details are ");
        System.out.println("The employee id is "+ eid);
        System.out.println("The employee name is "+ ename);
        System.out.println("The employee designation is "+ edesignation);

    }

}