package TheGoldenBucket;

public class Employee {
    private String name;
    private String title;

    public Employee (String name, String title){
        this.name=name;
        this.title=title;}

    public void setName(String name){
        this.name=name;
    }
    public String getName(){ return name;}

    public void setTitle(String title){this.title=title;}

    public String getTitle() {
        return title;
    }
}




