public class Multi_Array {
    public static void main(String[] args){
        double score [][] = {{3.3, 3.4},
                            {3.5, 3.6},
                            {3.7, 4.0},
                            {4.1, 4.2}};
        float sum1 = 0;
        float sum2 = 0;

        for (int i = 0; i < score.length; i++){
            for (int j = 0; j < score[i].length; j++){
                sum1 += score[i][j];
            }
            sum2 += sum1/2;
        }

        System.out.println(sum2/4);
        String a = "ABCD";
        String b = a.substring(0, 1);

        if (a.contains(b) == true){
            System.out.println(a);
        }
    
    }
}
