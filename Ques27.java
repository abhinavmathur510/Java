import java.util.Scanner;
public class Ques27{
    static boolean isPrime(int i){
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    static void twin(int num){
        int i=2;
        while((i+2) < num){
            if(isPrime(i) && isPrime(i+2)){
                System.out.printf("%d-%d\n",i,i+2);
            }
            i++;
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        twin(num);

    }
    
}