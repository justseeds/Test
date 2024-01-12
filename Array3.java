import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int max = 0;
        
        int num = scanner.nextInt();

        int intArray [] = new int[num];

        for (int i = 0; i < num; i++){
            intArray[i] = scanner.nextInt();
            if(intArray[i] > max){
                max = intArray[i];
            }
        }

        for (int j = 0; j < num; j++){
            sum += (double)intArray[j]/(double)max*100;
        }
        
        
        System.out.println(sum/num);
    

    }
}
