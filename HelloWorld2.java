import java.util.Scanner;

public class HelloWorld2 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        String BusName = sc1.next();
        int BusTime= sc1.nextInt();
        double BusKM = sc1.nextDouble();

        System.out.println("버스 번호는 "+BusName);
        System.out.println("남은 시간은 "+BusTime+"분");
        System.out.println("남은 거리는 "+BusKM+"Km");

    }
}
