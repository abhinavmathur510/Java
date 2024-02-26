import java.util.Scanner;
public class Ques22{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[][]=new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println("Enter element of the Array");
                Array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=2;i++){
            int max=0;
            for(int j=0;j<=2;j++){
                if(Array[i][j]>max){
                    max=Array[i][j];
                }
            }
            System.out.printf("THE max of %d th row is %d\n",i,max);
        }
    }
}