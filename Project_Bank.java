import java.util.*;
 class methods{
    public int bal=0;
    Scanner sc= new Scanner(System.in);
    void add(){
        System.out.println("Enter the amount to be deposited");
        bal=sc.nextInt()+bal; 
        System.out.println("Amount Deposited ");  
    }
    void with(){
        System.out.println("Enter the amount to be withdrawn");
        int money=sc.nextInt();
        if(money>bal){
            System.out.println("Your Balance is less than the Entered Amount");
        }
        else{
            bal=bal-money;
            System.out.println("Amount Withdrawn");
        }
    }
    void show(){
        System.out.println("Your Bank Balance is "+ bal+ "$");
    }
    void exit(){
        System.out.println("Thank You for using the Banking System !!");
    }
}
public class Project_Bank{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        methods ab= new methods(); 
        int option;
        int flag=0;
        while(flag==0){
            System.out.println("Choose from the below Options");
            System.out.println("1- Deposit Money");
            System.out.println("2- Withdraw Money");
            System.out.println("3- Show Bank Balance");
            System.out.println("4- Exit");
            option=sc.nextInt();
            if(option==1){
                ab.add();
            }
            else if(option==2){
                ab.with();
            }
            else if(option==3){
                ab.show();
            }
            else if(option==4){
                ab.exit();
                flag=1;
            }
            else{
                System.out.println("Invalid Input");
             }
        }

    }
} 