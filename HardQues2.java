import java.util.Scanner;
public class HardQues2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Array[]=new int[5];
        int ArrayC[]=new int[5];
        System.out.println("Enter 5 values between 0 and 10\n");
        for(int i=0;i<5;i++){
            Array[i]=sc.nextInt();
            if(Array[i]>10 || Array[i]<0){
                System.out.println("Entered value is invalid");
                break;
                
            }
        } 
        for(int i=0;i<5;i++){
            ArrayC[i]=10-Array[i];
        }

        for(int u=1;u<=10;u++){
            for(int i=0;i<5;i++){
                for(int j=0;j<10;j++){
                    if(j<ArrayC[i]){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print(" * ");
                    }
                    ArrayC[i]--;
                    break;
                }
            }
            System.out.print("\n");
        }


    }
   

}


