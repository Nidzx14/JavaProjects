import java.util.ArrayList;
import java.util.Scanner;

/*create batch, get batch from user and add 5 batch to batch arraylist*/
public class College_Arraylist {
    public static void main (String[] args) {
        int n; String batch;
        ArrayList<String> Batch = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of batches");
        n= input.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter your batch");
            batch = input.next();
            Batch.add(batch);
        }
        System.out.println(Batch);
        System.out.println("Last Batch is");
        String last = Batch.get(n-1);
        System.out.println(last);
    }
}
