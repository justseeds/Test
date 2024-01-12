import java.util.Scanner;

public class groupwords {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        int num = sc1.nextInt();
        int cnt = 0;
        sc1.nextLine();

        
        
        for (int i = 0; i < num; i++){
            String word = sc1.nextLine();
            System.out.println(word);
            if (word.length() == 1){
                continue;
            }
            for (int j =1; j < word.length(); j++){
                if(word.charAt(j-1) != word.charAt(j)){
                    String a = word.substring(j-1, j);
                    String s_word = word.substring(j, word.length());
                    if (s_word.contains(a) == true){
                        cnt += 1;
                        break;
                        
                    }
                }
            }

        }
        System.out.println(num - cnt);
    }
}
