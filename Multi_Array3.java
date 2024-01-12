import java.util.Scanner;

public class Multi_Array3 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        String[][] words = new String[5][15];
        String b;
        
        for (int i= 0; i < 5; i ++){
            String a = sc1.nextLine();
            
            for (int j= 0; j < a.length(); j ++){
                b = a.substring(j, j+1);
                words[i][j] = b;
            }
            
            
        }
        
        b = "";
        for (int x = 0; x < 15; x++){
            for (int y = 0; y < 5; y++){
                if (words[y][x] != null){
                    b += words[y][x];
                }
            }
        }
        System.out.println(b);
        
        
    }
    
}
