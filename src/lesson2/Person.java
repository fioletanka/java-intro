package lesson2;

public class Person {
    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;

    }

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        count++;
    }

    void doSomething() {
        System.out.println(count + "makes smth");
    }

    static void doSomethingElse() {
        System.out.println(count + "makes smth else");


    }

    static {
        System.out.println("Class was initialized.");
    }

    {
        System.out.println(count + "Person was created.");
    }

    private static void println(String out) {
        System.out.println(out);
    }
}
