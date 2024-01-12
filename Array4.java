import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int cnt = scanner.nextInt();

        int N_array [] = new int[len];
        int intarray [] = new int[len];

        for (int i = 0; i < len; i++){
            N_array[i] = i+1;
            intarray[i] = i+1;
        }
        
        for (int i = 0; i < cnt; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = 1;

            for (int j = x; j <= y; j++){
                intarray[j-1] = N_array[y-a];
                a += 1;
            }
            for (int k = 0; k < len; k++){
                N_array[k] = intarray[k];
            }
            
        }
        
        for (int i = 0; i < len; i++){
            System.out.print(intarray[i] + " ");
        }
        
    }
}
