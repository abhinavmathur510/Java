public class Format3{
    public static void main(String[]args) {
        int i,j,k,l,m;
        for(i=1;i<=5;i++){
            for(k=10;k>2*i;k--){
                System.out.print(' ');
            }
             
            System.out.print(i);
            

            if(i>1){ 
                for(l=1;l<=4*i-5 ;l++)
                        System.out.print(' ');
                
                System.out.print(i);
            }

            System.out.println();
        }
        for(i=4;i>=1;i--){
            for(k=2*i;k<10;k++){
                System.out.print(' ');
            }
             
            System.out.print(i);
            

            if(i>1){ 
                for(l=4*i-5;l>=1 ;l--)
                        System.out.print(' ');
                
                System.out.print(i);
            }

            System.out.println();
        }

    }
}