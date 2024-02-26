import java.util.Scanner;
public class Ques29{
    static void str(char a,char b){
        if(b<a){
            System.out.println("INVALID");
            return;
        }    
        for(char c=a;c<=b;c++){
            System.out.print(c+" ");
        }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 characters");
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        str(a,b);
    }
}