import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).
                collect(Collectors.toList());

        adjacentEqual(numbersList);
        printList(adjacentEqual(numbersList));
    }

    public static void printList(List<Double> numbers) {
        for (Double aDouble : numbers) {
            System.out.printf(new DecimalFormat("0.# ").format(aDouble));
        }
    }

    public static List<Double> adjacentEqual(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if ((numbers.get(i).equals(numbers.get(i + 1)))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i=-1;
            }
        }
        return numbers;
    }
}