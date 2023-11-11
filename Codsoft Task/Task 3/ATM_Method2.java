import java.util.*;

class BankAccount{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    void balanceShow(){
        System.out.println("Account Balance Rs.: "+balance+"");
    }
    boolean deposit(double value){
        if(value>0){
            balance+=value;
            return true;
        }
        return false;
    }
    boolean withdraw(double value){
        if(value>0 && value <=balance){
            balance-=value;
            return true;
        }
        return false;
    }
}

public class ATM_Method2{
    BankAccount obj;

    void init(){
        Scanner sc=new Scanner(System.in);
        System.out.print("First Deposit your Amount Rs.: ");
        double balance=sc.nextDouble();
        obj=new BankAccount(balance);

        while(true){
            showOptions();
            int choose=sc.nextInt();
            if(choose>=1 && choose<=4){
                switch(choose){
                    case 1:
                    System.out.println("Enter Deposit Amount Rs.: ");
                    double value=sc.nextDouble();
                    if(obj.deposit(value)){
                        System.out.println("Deposit Successfull..");
                    }
                    else{
                        System.out.println("Enter Valid Amount!!");
                    }
                    break;
                    case 2:
                    System.out.println("Enter withdraw Anount Rs.: ");
                    double value2=sc.nextDouble();
                    if(obj.withdraw(value2)){
                        System.out.println("Withdrawal successfull..");
                    }
                    else{
                        System.out.println("insuffition Balance or Invalid Amount!!");
                    }
                    break;
                    case 3:
                    obj.balanceShow();
                    break;
                    case 4:
                    System.out.println("Thank you Have a Nice Day...\n");
                    return;
                }
            }
            else{
                System.out.println("Choose Valid option !!");
            }
        }
    }
    void showOptions(){
            System.out.println("\nATM Menu :");
            System.out.println("1. Deposit");
            System.out.println("2. Withraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit Transction");
            System.out.print("Choose your Option (1/2/3/4) : ");
    }
    public static void main(String[] args) {
        ATM_Method2 obj=new ATM_Method2();
        obj.init();
    }
}