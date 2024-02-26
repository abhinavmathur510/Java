import java.util.Scanner;
public class Ques12{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter upper and lower limit");
        int l=sc.nextInt();
        int u=sc.nextInt();
        int i;
        int j;
        int flag=0;
        for(i=l;i<=u;i++){
            flag=0;
            if(i<=1){
                continue;
            }
            else{
                for(j=2;j<i;j++){
                    if(i%j==0){
                    flag=1;
                    break;
                }     
            } 
            } 
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}