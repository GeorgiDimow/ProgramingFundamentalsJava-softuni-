import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "Delete":
                    int numToRemove=Integer.parseInt(command[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "Insert":
                    int numToInsert=Integer.parseInt(command[1]);
                    int index=Integer.parseInt(command[2]);
                    numbersList.add(index,numToInsert);
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
