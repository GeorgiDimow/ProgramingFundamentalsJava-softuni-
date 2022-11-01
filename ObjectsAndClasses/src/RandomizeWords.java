import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> textArr = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        Random generator=new Random();
        for (int i = 0; i < textArr.size(); i++) {
            int randomIndex=generator.nextInt(textArr.size()-1);
            String getNum=textArr.get(i);
            textArr.set(randomIndex, getNum);


        }
        System.out.println(String.join(System.lineSeparator(),textArr));
    }
}
