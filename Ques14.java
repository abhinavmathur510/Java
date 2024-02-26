import java.util.Scanner;
public class Ques14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=4;i>=0;i--){
            System.out.printf("Enter element ");
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<=4;i++){
            System.out.println(arr[i]);
        }
        
    }  
}