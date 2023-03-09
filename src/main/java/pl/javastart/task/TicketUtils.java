package pl.javastart.task;

import java.util.Scanner;

public class TicketUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Ticket createTicket() {
        System.out.println("Podaj nazwę wydarzenia: ");
        String event = scanner.nextLine();
        Address address = createAddress();
        System.out.println("Wskaż typ biletu. Dostępne: online, standard, gift");
        TicketType type = null;
        try {
            type = TicketType.valueOf(scanner.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Podałeś nieprawidłowy typ biletu");
        }
        return new Ticket(event, address, type);
    }

    private static Address createAddress() {
        System.out.println("Podaj miasto w którym się odbywa: ");
        String city = scanner.nextLine();
        System.out.println("Podaj kod pocztowy: ");
        String postCode = scanner.nextLine();
        System.out.println("Podaj ulicę: ");
        String street = scanner.nextLine();
        System.out.println("Podaj nr domu/mieszkania: ");
        String number = scanner.nextLine();
        return new Address(city, postCode, street, number);
    }
}
