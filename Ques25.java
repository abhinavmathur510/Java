import java.util.Scanner;
public class Ques25{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
        
        for(int i=0;i<=str.length()-1;i++){
            int flag=0;
            for(int j=i+1;j<=str.length()-1;j++){
                if( str.charAt(i)==str.charAt(j)){
                    flag=1;
                    break;
                }  
            }  
        if(flag==1){
            System.out.println(str.charAt(i));
            break;
        }
        }
       

    }
}