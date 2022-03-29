package TheGoldenBucket;

public class Employee {

    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return name + " the " + title;
    }
}
