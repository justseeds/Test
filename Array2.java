import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int intArray [] =  new int[9];
        int max = 0;
        int num = 0;

        for (int i = 0; i < 9; i++){
            intArray[i] = scanner.nextInt();
            if(intArray[i] > max){
                max = intArray[i];
                num = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(num);


    }
}
