package zajecia.dziewiate;

import com.sun.jndi.cosnaming.IiopUrl;

/**
 * Created by RENT on 2017-02-11.
 */
public class zajecia9 {
    public static void main (String[] args) {
        User user = new User("Piotr", "Alejski", "1410");
        Address address = new Address ("Poznan", "Poznanska", "30", "61-863", "PL");
        user.address = address;
        user.print();

//       User user = new User();
//        user.firstname = "Piotr";
//        user.lastname = "Alejski";
//        user.birthdate = "1410";
//        User user2 = new User();
//        user2.firstname = "Jan";
//        user2.lastname = "Kowalski";
//        user2.birthdate = "1918";
//        user.print();
//        User[] users = new User[2];
//        users[0] = user;
//        users[1] = user2;
//        printUsers(users);



    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length ; i++) {
            users[i].print();
        }
    }
}
