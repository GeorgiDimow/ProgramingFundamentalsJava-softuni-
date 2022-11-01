import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print(numbers(n)[i]+" ");
        }
    }
    public static int[] numbers(int n){
        int[] arr=new int[n];

        if (n==1){
            arr[0]=1;
        }else if (n==2 ){
            arr[0]=1;
            arr[1]=1;
        }else if(n==3){
            arr[0]=1;
            arr[1]=1;
            arr[2]=2;
        } else  {
            arr[0]=1;
            arr[1]=1;
            arr[2]=2;
            for (int i = 3; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }

        return arr;
    }
}
