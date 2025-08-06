public class Employee {

    private static int val = 20;

    private String employeeName;
    private String designation;
    private int salary;
    private Address address;
    private int age;

    public static void justForPracticeStatic(){
        System.out.println(val);
    }

    public Employee(String employeeName, Address address){
        System.out.println("Constructor with two String parameters...");
        this.employeeName = employeeName;
        this.address = address;
    }

    public Employee(int age, int salary, String name, Address address){
        this(name, address);
        this.age = age;
        this.salary = salary;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setAge(int age){
        if(age > 100){
            System.out.println("httttttttttt");
        }else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayEmployeeDetails(){
        System.out.println("Name  -"+employeeName);
        System.out.println("Designation - "+designation);
        System.out.println("Salary -"+salary);
        System.out.println("Address - "+address);
        System.out.println("Age - "+age);
    }

}
