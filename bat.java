import java.util.Scanner;

public class bat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int cnt = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <= cnt; i++){
            int a = sc.nextInt();
            if (a != i){
                count += 1;
            }
        }

        System.out.print(count);
        
    }
}
