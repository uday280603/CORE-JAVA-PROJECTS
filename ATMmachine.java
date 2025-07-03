package ATM;
import java.util.Scanner;
class ATM{
    float balance;
    int pin =8640;
    public void Check_pin(){
        System.out.println("ENTER YOUR PIN");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if(entered_pin == pin){
            menu();
        }
        else {
            System.out.println("PIN INVALID ...TRY AGAIN ");
            Check_pin();
        }
    }
    public void menu(){
        System.out.println("------------MENU-------------");
        System.out.println("Enter your option: ");
        System.out.println("1.CHECK BALANCE");
        System.out.println("2.DEPOSIT AMOUNT");
        System.out.println("3.WITHDRAW AMOUNT");
        System.out.println("4.EXIT");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option==1){
            checkbalance();
        }
        else if(option==2){
            deposit();
        }
        else if (option == 3){
            withdraw ();
        } else if (option ==4) {
            System.out.println("Exited");
            return;
        }
        else {
            System.out.println("PLESE ENTER VALID OPTION");
        }


    }
    public  void checkbalance(){
        System.out.println("YOUR ACCOUNT BALANCE IS= "+balance);
        menu();
    }
    public void deposit(){
        System.out.println("ENTER AMOUNT TO DEPOSIT = ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
        balance =balance+amount;
        System.out.println("CURRENT BALANCE = "+balance);
        menu();
    }
    public void withdraw(){
        System.out.println("ENTER AMOUNT TO WITHDRAW = ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount<=balance){
            balance =balance-amount;
            System.out.println("AMOUNT WITHDRAW SUCCESSFULLY");
            System.out.println("YOUR CURRENT BALANCE IS = "+balance);
        }
        else {
            System.out.println("INSUFFICIENT FUND..");
        }
        menu();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.Check_pin();

    }
}
