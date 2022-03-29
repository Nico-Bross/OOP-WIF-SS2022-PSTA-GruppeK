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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
