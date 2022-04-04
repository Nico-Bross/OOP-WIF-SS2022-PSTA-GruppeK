package TheGoldenBucket;

public class Employee {
   private String name;
   private String title;

   public Employee(String name,String titel){
       this.name = name;
       this.title = titel;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
