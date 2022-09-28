import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condensed= new int[numbers.length-1];
        int length= condensed.length;
        if (numbers.length==1){
            System.out.println(numbers[0]);
        }else {
            while (length >= 0) {
                for (int i = 0; i < length; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                    for (int number : condensed) {
                        number = condensed[i];
                        numbers[i] = number;
                    }
                }
                length--;
            }
            System.out.println(condensed[0]);
        }


    }
}
