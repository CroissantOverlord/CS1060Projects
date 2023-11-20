public class Staff extends Employee {

    private String title;

    public Staff(String name, String Address, String phoneNumber, String emailAddress, String department, Double salary, String dateHired, String title){
        super(name, Address, phoneNumber, emailAddress, department, salary, dateHired);
        this.title = title;


    }
}
