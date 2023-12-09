import java.util.Scanner;

public interface CollegeLeaveCalculator{
    static final int totalavailableleave=10;
    void get();
    void displaystudent();
    void leavecalculator();
}

class Student implements CollegeLeaveCalculator {
    String sname,sid, smail, saddress;
    long sphone;
    Scanner input = new Scanner(System.in);
    public void get(){
        System.out.println("Enter the Student's id");
        sid= input.next();
        System.out.println("Enter the Student's name");
        sname= input.next();
        System.out.println("Enter the Student's phone no");
        sphone= input.nextLong();
        System.out.println("Enter the Student's address");
        saddress= input.next();
        System.out.println("Enter the Student's email");
        smail= input.next();
    }

    public void displaystudent(){
        System.out.println("The student details are");
        System.out.println("Name" + sname);
        System.out.println("ID:" + sid);
        System.out.println("Name:" + sphone);
        System.out.println("Name:" + saddress);
        System.out.println("Name:" + smail);

    }

    public void leavecalculator(){
        int totalleavetaken;
        System.out.println("Enter the number of leaves you have taken");
        totalleavetaken = input.nextInt();
        int currentleaves = totalavailableleave - totalleavetaken;
        System.out.println(("You have " + currentleaves + " leaves left"));
    }

    public static void main(String args[]){
        Student s = new Student();
        s.get();
        s.displaystudent();
        s.leavecalculator();
    }
}