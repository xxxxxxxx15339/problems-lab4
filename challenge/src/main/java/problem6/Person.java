package problem6;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void display() {
        System.out.println("I am " + name);
    }
}
