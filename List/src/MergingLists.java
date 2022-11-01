import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        List<Integer> numbersList1 = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int minSize = Math.min(numbersList.size(), numbersList1.size());
        for (int i = 0; i < minSize; i++) {
            int numFirstList = numbersList.get(i);
            int numSecondList = numbersList1.get(i);

            resultList.add(numFirstList);
            resultList.add(numSecondList);
        }

        if (numbersList.size() > numbersList1.size()) {
            resultList.addAll(numbersList.subList(minSize, numbersList.size()));
        } else if (numbersList1.size() > numbersList.size()) {
            resultList.addAll(numbersList1.subList(minSize, numbersList1.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }

}
