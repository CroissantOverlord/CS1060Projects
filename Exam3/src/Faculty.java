public class Faculty extends Employee {

    private String officeHours;

    private String rank;



    public Faculty(String name, String Address, String phoneNumber, String emailAddress, String department, Double salary, String dateHired, String officeHours, String rank){
        super(name, Address, phoneNumber, emailAddress, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;



    }
}
