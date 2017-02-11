package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Address {
    public String city;
    public String street;
    public String houseNumber;
    public String zipCode;
    public String country;

    public Address(String city, String street, String houseNumber, String zipCode, String country) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.country = country;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(zipCode)
                .append(" ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(" ")
                .append(zipCode)
                .append(" ")
                .append(country)
                .append(" ");
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);


    }

 }
