package person;

/**
 * personclient
 */
public class Personclient {
    public static void main(String[] args) {

        // creating object
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.name);// null
        System.out.println(p1.age);// 0

        // adding or changing the value
        p2.name = "piyush";
        p2.age = 20;

        System.out.println(p2.name);
        System.out.println(p2.age);

        // p1=p2;
        p1 = p2;
        System.out.println("When p1=p2");
        System.out.println(p1.name);
        System.out.println(p1.age);

    }
}