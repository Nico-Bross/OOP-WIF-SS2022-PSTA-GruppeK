package TheGoldenBucket;

public class Employee {
    String name;
    String title;

    public Employee(){}

    private Employee(String EmployeeName, String EmployeeTitle){
        this.name=EmployeeName;
        this.title=EmployeeTitle;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public void setEmployee(String name, String title) {
        this.name = name;
        this.title = title;
    }


}