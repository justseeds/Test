import java.util.Scanner;

public class dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || a == c){
            if (a == c &&  a != b){
                System.out.println(1000+a*100);
            }
            else if (b == c &&  c != a){
                System.out.println(1000+b*100);
            }
            else if (a == b &&  c != b){
                System.out.println(1000+b*100);
            }

            else{
                System.out.println(10000+b*1000);
            }
        }
        else{
            if (a > c && a>b){
                System.out.println(a*100);
            }
            else if(c > a && c > b){
                System.out.println(c*100);
            }
            else{
                System.out.println(b*100);
            }

        }
    }
}
