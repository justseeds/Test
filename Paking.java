import java.util.Scanner;

public class Paking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int prise = 0;
        String car = sc.next();
        int time = sc.nextInt();

        switch(car){
            case "nomal":
                if (time >= 7.5){
                    prise = 30000;
                }
                else{
                    prise = 4000*time;
                }
                break;

            case "disabled":
                if (time >= 7.5){
                    prise = 30000;
                }
                else{
                    prise = 4000*time;
                }
                prise /= 2;
                break;
            
            case "light":
                if (time >= 7.5){
                    prise = 30000;
                }
                else{
                    prise = 4000*time;
                }
                prise /= 2;
                break;
            }

        System.out.println("차 : " + car + " 시간 : " + time + " 금액 : " + prise);  
    }
        
}
