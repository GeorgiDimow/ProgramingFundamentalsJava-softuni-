import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int count=0;
        for (int i = 0; count < n; i++) {
            if(i%2!=0){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
