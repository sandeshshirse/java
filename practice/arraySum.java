import java.util.Arrays;
public class array1 {
    public static void main(String[] args) {
        // int[] num = {10, 20, 30, 40, 50};
        // System.out.println(num.length);
        // System.out.println(num[0]);

        int[] num = new int[4];
        

        num[0] = 5;
        num[1] = 8;
        num[2] = 40; 
        num[3] = 78; 
        int sum = 0; 
        for(int i=0; i<num.length; i++){
            sum = sum + num[i];
        }

        System.out.println(sum);
        


    }
}
