package lesson2;

public class SecondProgram {
    public static void main(String[] args){
        Person p1 = new Person ("jfhjis","jwbfkwe", 10);
        p1.doSomething();
        Person p2 = new Person ("rthr","erte");
        p2.doSomething();
        Person p3=p2;
        p2.secondName= "jhfjhwejkfgkjw";
        System.out.println(p3.secondName);
        String str1 = new String("str");
        String str2 = new String("str");
        if (p1.firstName==p2.firstName) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
