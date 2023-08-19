// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "ABC";

        Person p2 = new Person();
        p2.name = "DEF";
        p2.age = 20;

        fun(p1, p2);
        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }

    static void fun(Person p1, Person p2)
    {
        Person tmp = p1;
        p1 = p2;
        p2 = tmp;
    }
}