package constructors;

public class Person {

    private String name;
    private int age;

    // default Constructor
    public Person() {
        System.out.println("I AM THE DEFAULT CONSTRUCTOR");
    }

    // parameterized Constructors

    // one parameter
    public Person(int age) {
        System.out.println("I AM PARAMETERIZED CONSTRUCTOR WITH ONE PARA");
        this.age = age; // set the
    }

    // two parameters
    public Person(int age, String name) {
        System.out.println("I AM PARAMETERIZED CONSTRUCTOR WITH TWO PARA");
        this.age = age;
        this.name = name;
    }

    // NAME

    // setting and getting number
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    // AGE
    // setting and getting age
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return this.age;
    }

}