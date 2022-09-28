import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String[] inputArr=input.split(" ");
        String ArrRev="";
        for (int i = inputArr.length-1; i >=0 ; i--) {
            ArrRev+=inputArr[i]+" ";
        }
        System.out.println(ArrRev);
    }
}
