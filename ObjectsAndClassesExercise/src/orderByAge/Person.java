package orderByAge;

public class Person {
    private String name;
    private int id;
    private  int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.",this.name,this.id,this.age);
    }
}
