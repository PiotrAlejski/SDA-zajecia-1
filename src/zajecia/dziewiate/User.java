package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class User {
    public String firstname;
    public String lastname;
    public String birthdate;
    public Address address;


    public void print() {
        System.out.println(firstname + " " + lastname + " born in " + birthdate);
        if(address!=null){
            address.print();
        }
    }

    public User(String firstname, String lastname, String birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public User(String firstname, String lastname, String birthdate, Address address) {
        this(firstname,lastname, birthdate) ;
        this.address = address;
    }
}
