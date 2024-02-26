import java.util.Scanner;
public class Ques24{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[][]=new int[4][4];
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.println("Enter Elements");
                Array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                for(int k=j+1;k<=3;k++){
                    if(Array[i][k]==Array[i][j]){
                        System.out.printf("%d\n",Array[i][k]);
                        break;
                    }
                }
            }
        }

    }
}