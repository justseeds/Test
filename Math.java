import java.util.Scanner;

public class Math {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int HTall= sc1.nextInt();

        String check = (HTall >= 120) ? "탑승가능" : "탑승불가능" ;

        System.out.println("현재 손님의 키는 "+HTall+"cm 이므로 "+check+"합니다");
        
    }
}
