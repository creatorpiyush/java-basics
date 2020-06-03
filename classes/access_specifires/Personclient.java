package access_specifires;

/**
 * Personclient
 */
public class Personclient {

    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        p1.setName("Piyush");
        p1.setAge(20);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}