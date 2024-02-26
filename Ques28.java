import java.util.Scanner;
public class Ques28{
    static void mid(String str){
        int a =str.length();
        if(a%2==0){
            System.out.println(str.charAt(a/2 - 1) + "" + str.charAt(a/2));
        }
        else{
            System.out.println(str.charAt(a/2));
        } 
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string\n");
        String name=sc.nextLine();
        mid(name);
    }
}