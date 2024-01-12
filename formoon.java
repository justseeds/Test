import java.util.Scanner;

public class formoon {
    public static void main(String[] args){
        /*
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        /*
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        for (int i = 1; i <= 5; i++){
            for (int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        */
        
        /*
        for (int i = 1; i <= 9; i+=2){
            for (int j = 9; j >= i; j-=2){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        */

        Scanner sc = new Scanner(System.in);
        int layer = sc.nextInt();

        /* 
        for (int i = 1; i <= layer; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        for (int i = layer; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* 
        for (int i = 1; i <= layer; i++){
            for (int j = layer; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        
        for (int i = 1; i <= layer*2-1; i+=2){
            for (int j = layer*2-1; j >= i; j-=2){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
