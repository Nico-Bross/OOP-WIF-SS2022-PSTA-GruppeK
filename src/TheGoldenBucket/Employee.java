package TheGoldenBucket;

public class Employee {
    String name;
    String title;
    /*private Employee(String EmployeeName, String EmployeeTitle){
        this.name=EmployeeName;
        this.title=EmployeeTitle;
    }*/

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
    // Immer Name+Titel oder getrennt?

    public void setEmployee(String name, String title) {
        this.name = name;
        this.title = title;
    }


}
