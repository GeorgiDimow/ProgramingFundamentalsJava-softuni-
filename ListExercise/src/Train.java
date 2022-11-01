import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        int capacity=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "Add":
                    int numToAdd=Integer.parseInt(command[1]);
                    numbersList.add(numToAdd);
                    break;
                default:
                    int numToWagon=Integer.parseInt(command[0]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        if(numbersList.get(i)+numToWagon<=capacity){
                            numbersList.set(i,numbersList.get(i)+numToWagon);
                            break;
                        }
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (int number:numbersList) {
            System.out.print(number+" ");
        }
    }
}
