public class Student extends Person{

    private String status;


    public Student(String name, String Address, String phoneNumber, String emailAddress, String status){
        super(name, Address, phoneNumber, emailAddress);
        this.status = status;

    }


}
