import java.util.Scanner;

public class Multi_Array2 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        int[][] score = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                int a1 = sc1.nextInt();
                score[i][j] = a1;
                if(score[i][j] >= max){
                    max = score[i][j];
                    x = i+1;
                    y = j+1;
                }
            }

        }
        
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
