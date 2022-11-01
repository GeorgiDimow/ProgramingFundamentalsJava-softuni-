import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> booksList = Arrays
                .stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("Done")){
            String[] command=input.split(" \\| ");
            switch (command[0]){
                case "Add Book":
                    String bookToAdd=command[1];
                    if(!booksList.contains(bookToAdd)) {
                        booksList.add(0, bookToAdd);
                    }
                    break;
                case "Take Book":
                    String bookToTake=command[1];
                    if(booksList.contains(bookToTake)) {
                        booksList.remove(booksList.indexOf(bookToTake));
                    }
                    break;
                case "Swap Books":
                    String bookToSwap1=command[1];
                    String bookToSwap2=command[2];
                    int index1=booksList.indexOf(bookToSwap1);
                    int index2=booksList.indexOf(bookToSwap2);
                    if(booksList.contains(bookToSwap1) && booksList.contains(bookToSwap2)){
                        booksList.set(index1,bookToSwap2);
                        booksList.set(index2,bookToSwap1);
                    }
                    break;
                case "Insert Book":
                    String bookToInsert=command[1];
                    if(!booksList.contains(bookToInsert)) {
                        booksList.add(bookToInsert);
                    }
                    break;
                case "Check Book":
                    int indexToCheck=Integer.parseInt(command[1]);
                    if(indexToCheck<booksList.size() && indexToCheck>=0) {
                        System.out.println(booksList.get(indexToCheck));
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        System.out.println(String.join(", ",booksList));
    }

}
