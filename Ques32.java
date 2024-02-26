import java.util.Scanner;
class point{
    private int x;
    private int y;
    point(){
        System.out.println("NOTHING");
    }
    point(int a,int b){
        x=a;  
        y=b;
    }
    public void setX(int c){
        x=c;

    }
    public void setY(int d ){
         y=d;
        
    }
    public void display(){
        System.out.println(x+" "+y);
    }

}
public class Ques32{
    public static void main(String[] args){
        point p1=new point();
        point p2=new point(5,10);
        p1.setX(1);
        p1.setY(2);
        p1.display();
    }
}