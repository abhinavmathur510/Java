public class Format5{
    public static void main(String[]args){

        for(int i=1 ; i<=4 ; i++) {
            int x=1;
            while(x<=i){
                System.out.print(x++);
            }

            int space = 7 - 2*i;
            while(space>0){
                System.out.print(" ");
                x++;
                space--;
            }

            while(x<=7){
                System.out.print(x++);
            }

            System.out.println();
        }


        for(int i=3;i>=1;i--){
            int x =1;
            while(x<=i){
                System.out.print(x++);
            }
            int space=7-2*i;
            while(space>0){
                System.out.print(" ");
                x++;
                space--;
            }
            while(x<=7){
                System.out.print(x++);
            }

         System.out.println();   
        }
    }
}