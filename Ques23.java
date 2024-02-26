import java.util.Scanner;
public class Ques23{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[][]=new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println("Enter element");
                Array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=2;i++){
            int flag=0;
            int j=0;
            if((Array[i][j+1]>Array[i][j]) && (Array[i][j+2] > Array[i][j+1])){
                    flag=1;
            }
            
            if(flag==1){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }
    } 
}