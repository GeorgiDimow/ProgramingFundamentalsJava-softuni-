import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input=scanner.nextLine();
        while (!input.equals("Craft!")){
            String[] command=input.split(" - ");
            switch (command[0]){
                case "Collect":
                    if(!itemsList.contains(command[1])){
                        itemsList.add(command[1]);
                    }
                    break;
                case "Drop":
                    String removeItem = command[1];
                    itemsList.remove(removeItem);
                    break;
                case "Combine Items":
                    String[] items= command[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if (itemsList.contains(oldItem)) {
                        int indexOldItem = itemsList.indexOf(oldItem);
                        itemsList.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = command[1];
                    if(itemsList.contains(renewItem)){
                        itemsList.remove(renewItem);
                        itemsList.add(renewItem);
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.println(String.join(", ", itemsList));
    }
}
