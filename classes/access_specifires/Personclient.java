package access_specifires;

/**
 * Personclient
 */
public class Personclient {

    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.getName()); // null
        System.out.println(p1.getAge()); // 0(zero)

        p1.setName("Piyush");
        p1.setAge(20);

        System.out.println(p1.getName()); // Piyush
        System.out.println(p1.getAge()); // 20
    }
}