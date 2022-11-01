package articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String articleData=scanner.nextLine();
        String[] articleParts=articleData.split(", ");
        Article article=new Article(articleParts[0],articleParts[1],articleParts[2]);


        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command=scanner.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    String newContent=command[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor=command[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newName=command[1];
                    article.rename(newName);
                    break;
            }

        }
            System.out.printf("%s - %s: %s%n",article.getTitle(),article.getContent(),article.getAuthor());
    }
}
