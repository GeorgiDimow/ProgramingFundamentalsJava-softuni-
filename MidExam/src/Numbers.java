import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("Finish")){
            String[] command=input.split(" ");
            switch (command[0]){
                case "Add":
                    int numToAdd=Integer.parseInt(command[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove=Integer.parseInt(command[1]);
                    numbersList.remove(index(numbersList,numToRemove));
                    break;
                case "Replace":
                    int valToReplace=Integer.parseInt(command[1]);
                    int replacement=Integer.parseInt(command[2]);
                    numbersList.set(index(numbersList,valToReplace),replacement);
                    break;
                case "Collapse":
                    int collapseNum=Integer.parseInt(command[1]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        if(numbersList.get(i)<collapseNum){
                            numbersList.remove(i);
                            i=-1;
                        }
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
    public static int index(List<Integer> nums,int val){
        int i=0;
        while (!(nums.get(i) == val)){
            i++;
        }
        return i;
    }

}
