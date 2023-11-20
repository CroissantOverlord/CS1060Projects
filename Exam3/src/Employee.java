public abstract class Employee extends Person{

    private String department;

    private Double salary;

    private String dateHired;

    public Employee(String name, String Address, String phoneNumber, String emailAddress, String department, Double salary, String dateHired){
        super(name, Address, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;

    }

}
