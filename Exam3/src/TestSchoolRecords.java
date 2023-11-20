
public class TestSchoolRecords {

    public static void main(String args[]){

        Person[] peopleInSchool = new Person[6];
                peopleInSchool[0] = new Student("Smeebleton", "450 Ton Dr", "970-555-4843", "shnfgksh@gmail.com", "Sophomore");
                peopleInSchool[1] =  new Student("Tom", "301 Chung Ave", "649-855-5545","vhgnf@hotmail.com","Senior");
                peopleInSchool[2] =new Faculty("Geort", "123 ABC Dr", "245-545-4664","bruh@gmail.com","Education",100.00,"10/03/1807","6pm-8am","Senior" );
                peopleInSchool[3] =new Faculty("Debra", "401 joemama Blvd", "233-995-4642","bruv@gmail.com","Education",50000.00,"3/26/1506","9am-5pm","Senior" );
                peopleInSchool[4] =new Staff("Joe", "7478 Cen Ave", "665-346-1122","bladerunnerman@yahoo.com","Sanitation",150000.00, "04/31/2049", "Sanitation Leader");
                peopleInSchool[5] =new Staff("Luke", "638 Skywalker dr", "125-346-1772","lightsiderules@yahoo.com","Security",14000.00, "06/01/1977", "Rescource Officer");


        for (Person person : peopleInSchool){
            System.out.println(person);

        }



    }
}
