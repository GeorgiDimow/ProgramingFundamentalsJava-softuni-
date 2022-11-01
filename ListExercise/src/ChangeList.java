import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "Add":
                    int numToAdd=Integer.parseInt(command[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove=Integer.parseInt(command[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numToRemoveAt=Integer.parseInt(command[1]);
                    numbersList.remove(numToRemoveAt);
                    break;
                case "Insert":
                    int numToInsert=Integer.parseInt(command[1]);
                    int index=Integer.parseInt(command[2]);
                    numbersList.add(index,numToInsert);
                    break;
            }
            input=scanner.nextLine();
        }
        for (int number:numbersList) {
            System.out.print(number+" ");
        }
    }
}
