import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args){
        System.out.println("Hello rushi this side ");
        System.out.println("I am using main branch");
        Employee employee1=new Employee(1,"rushikesh shinde" ,"Pune");
        Employee employee2=new Employee(2, "krishna dudhate", "Parbhani");
        Employee employee3=new Employee(3, "Yash Solanke", "Nanded");
        Employee employee4=new Employee(4, "Om Jogdand", "Mumbai");

       
        List<Employee> employees=new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        
        for(Employee employee:employees){
            System.out.println(employee);
        }
        
        
    }
}

class Employee{
    private int id;
    private String name;
    private  String city;
    
     // Constructor
     public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", city='" + city + '\'' +
               '}';
    }

}