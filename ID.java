import java.util.Scanner;

public class ID {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String Id = sc.nextLine();

        System.out.println(Id.substring(0, Id.indexOf("-")+2));

    }
}
