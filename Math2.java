import java.util.Scanner;

public class Math2 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        int a1 = sc1.nextInt();
        int a2 = sc1.nextInt();

        System.out.println(a1 + " + " + a2 + " = " + (a1+a2));
        System.out.println(a1 + " - " + a2 + " = " + (a1-a2));
        System.out.println(a1 + " * " + a2 + " = " + a1*a2);
        System.out.println(a1 + " / " + a2 + " = " + (double)a1/a2);

    }
}
