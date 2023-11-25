import java.util.Scanner;
abstract class BankAccount{
    abstract void deposit();
    abstract void withdraw();
}


class SavingsAccount extends BankAccount{
    Scanner input = new Scanner(System.in);
    float withdrawalamount,currentbalance=1000,depositamount;

    void deposit() {
        System.out.println("Enter the amount of money you wish to deposit");
        depositamount= input.nextFloat();
      currentbalance = currentbalance + depositamount;
      System.out.println("Current Balance ="+currentbalance);
    }

    void withdraw() {
        System.out.println("Enter the amount of money you wish to withdraw");
        withdrawalamount=input.nextFloat();
        currentbalance = currentbalance - withdrawalamount;
        if (currentbalance >100){
           System.out.println("Current Balance ="+currentbalance);

       }
       else
           System.out.println("Insufficient Funds! Cannot Withdraw!");
    }

    public static void main(String args[]) {
        SavingsAccount s = new SavingsAccount();
        s.deposit();
        s.withdraw();
    }

    }

