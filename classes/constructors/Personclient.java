package constructors;

public class Personclient {

    public static void main(String[] args) {
        Person p1 = new Person();
        // when constructor then it is called through this

        // parameterized constructor
        Person p2 = new Person(25);// used to call parameterized constructor
        System.out.println(p2.getAge());
        System.out.println(p2.getName());

        Person p3 = new Person(25, "Piyush Anand");
        System.out.println(p3.getAge());
        System.out.println(p3.getName());
    }
}