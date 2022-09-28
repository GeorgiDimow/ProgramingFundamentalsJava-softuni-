import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] Array1= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] Array2= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        boolean isIdentical=true;
        for (int i = 0; i < Array1.length; i++) {
            if(Array1[i]!=Array2[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isIdentical=false;
                break;
            }else {
                sum+=Array1[i];
            }
        }
        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
