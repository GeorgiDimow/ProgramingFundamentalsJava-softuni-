package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Student student=new Student(data[0], data[1], Double.parseDouble(data[2]));
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student s:studentList) {
            System.out.println(s.toString());
        }
    }

}
