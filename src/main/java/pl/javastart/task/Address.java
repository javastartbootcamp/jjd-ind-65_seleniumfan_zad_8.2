package pl.javastart.task;

public class Address {
    private String city;
    private String postCode;
    private String street;
    private String number;

    public Address(String city, String postCode, String street, String number) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "miasto = '" + city + '\'' +
                ", kod pocztowy = '" + postCode + '\'' +
                ", ulica = '" + street + '\'' +
                ", numer = '" + number + '\'';
    }
}
