import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("End")){
            String[] command=input.split("\\s+");

            switch (command[0]){
                case "Add":

                    int numToAdd=Integer.parseInt(command[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int indexToRemove =Integer.parseInt(command[1]);
                    if(indexToRemove<=numbersList.size()-1 && indexToRemove>=0) {
                        numbersList.remove(indexToRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Insert":
                    int index=Integer.parseInt(command[2]);
                    if(index<=numbersList.size()-1 && index>=0) {
                        int insert =Integer.parseInt(command[1]);
                        numbersList.add(index, insert);
                    }else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    switch (command[1]){
                        case "left":
                            int countLeft=Integer.parseInt(command[2]);
                            for (int i = 1; i <= countLeft; i++) {
                                int firstNum=numbersList.get(0);
                                numbersList.add(firstNum);
                                numbersList.remove(0);
                            }
                            break;
                        case "right":
                            int countRight=Integer.parseInt(command[2]);
                            for (int i = 1; i <= countRight; i++) {
                                int lastNum=numbersList.get(numbersList.size()-1);
                                numbersList.add(0,lastNum);
                                numbersList.remove(numbersList.size()-1);
                            break;
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
}
