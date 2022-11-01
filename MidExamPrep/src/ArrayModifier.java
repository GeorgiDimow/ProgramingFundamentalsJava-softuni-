import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "swap":
                    int index1=Integer.parseInt(command[1]);
                    int index2=Integer.parseInt(command[2]);
                    int number1 = numbersList.get(index1);
                    int number2 = numbersList.get(index2);
                    numbersList.set(index1,number2);
                    numbersList.set(index2,number1);
                    break;
                case "multiply":
                    int index1ToMultiply=Integer.parseInt(command[1]);
                    int index2ToMultiply=Integer.parseInt(command[2]);
                    int number1ToMultiply = numbersList.get(index1ToMultiply);
                    int number2ToMultiply = numbersList.get(index2ToMultiply);
                    numbersList.set(index1ToMultiply,number1ToMultiply*number2ToMultiply);
                    break;
                case "decrease":
                    for (int i = 0; i < numbersList.size(); i++) {
                        numbersList.set(i,numbersList.get(i)-1);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size()-1; i++) {
            System.out.print(numbersList.get(i)+", ");
        }
        System.out.print(numbersList.get(numbersList.size()-1));
    }
}
