import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        int length = numbersList.size() - 1;
        if (length % 2 == 0) {
            for (int i = 0; i < length / 2; i++) {
                numbersList.set(i, numbersList.get(i) + numbersList.get(length - i));
                numbersList.remove(length - i);
            }
        } else {
            for (int i = 0; i <= length / 2; i++) {
                numbersList.set(i, numbersList.get(i) + numbersList.get(length - i));
                numbersList.remove(length - i);
            }
        }
            for (int numbers : numbersList) {
                System.out.print(numbers + " ");
            }
    }
}

