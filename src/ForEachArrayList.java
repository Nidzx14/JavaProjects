import java.util.ArrayList;
import java.util.Scanner;

/* Class Student, id,name,age,phone,email. GetDetail() and store it in ArrayList<Student>
Using For Each, print
 */

public class ForEachArrayList {

    public static void main(String[] args){

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = input.nextInt();
        ArrayList<StudentS> student = new ArrayList<>();
        System.out.println("Student Details");
        for(int i=1;i<=n;i++){
            System.out.println("Student Data "+i);
            StudentS Safa = new StudentS();
            System.out.println("Enter the id: ");
            Safa.getId();
            System.out.println("Enter the name: ");
            Safa.getName();
            System.out.println("Enter the age: ");
            Safa.getAge();
            System.out.println("Enter the email id: ");
            Safa.getEmail();
            student.add(Safa);
        }
        System.out.println("\n\n ----Student Details----");
        for(StudentS st:student){
            System.out.println("ID: "+st.id+"\nName: "+st.name+"\nAge: "+st.age+"\nEmail: "+st.email);
        }
    }

}

class StudentS{
    Scanner input = new Scanner(System.in);
    int id,age;
    String name, email;

    public int getId() {
        id=input.nextInt();
        return id;
    }

    public int getAge() {
        age=input.nextInt();
        return age;
    }

    public String getName() {
        name=input.next();
        return name;
    }

    public String getEmail() {
        email=input.next();
        return email;
    }
}
