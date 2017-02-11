package zajecia.dziewiate;

import com.sun.jndi.cosnaming.IiopUrl;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class zajecia9 {
    public static void main(String[] args) {
//        User user = new User("Piotr", "Alejski", "1410");
//        Address address = new Address ("Poznan", "Poznanska", "30", "61-863", "PL");
//        user.address = address;
//        user.print();
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
//        String message = " Wales welcome England to Cardiff in the Six Nations on Saturday with visiting coach Eddie Jones warning his team to expect all manner of \"shenanigans\" from the hosts.";
//        Book book = new Book("Krzyzacy", "Henryk Sienkiewicz", "2000", message.split(" "));
//        book.setCategory("Historyczna");
//        book.setDescription("fajna");
//
//        String page = book.getPage(5);
//        System.out.println(page);
        String message = " Wales welcome England to Cardiff in the Six Nations on Saturday with visiting coach Eddie Jones warning his team to expect all manner of \\\"shenanigans\\\" from the hosts.\"";
        BookShelf bookShelf = new BookShelf();
        Book book = new Book("Krzyzacy", new Writer("Henryk", "Sienkiewicz"), 2000, message.split(""));
        Book book2 = new Book("Ogniem i miezem", new Writer("Henryk", "Sienkiewicz"), 2005, message.split(""));
        Book book3 = new Book(" Dziady", new Writer("Adam", "Mickiewicz"), 1996, message.split(" "));
        bookShelf.add(book);
        bookShelf.add(book2);
        bookShelf.add(book3);

        ArrayList<Book> booksOf = bookShelf.getBooksOf("Henryk Sienkiewicz");
        System.out.println(booksOf);
    }
}

//    public static void printUsers(User[] users) {
//        for (int i = 0; i < users.length ; i++) {
//            users[i].print();
//        }
//    }
//}
