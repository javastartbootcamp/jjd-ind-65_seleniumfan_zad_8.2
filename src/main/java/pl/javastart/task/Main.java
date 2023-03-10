package pl.javastart.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile chcesz kupić biletów: ");
        int number = scanner.nextInt();

        List<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("######### WPROWADŹ DANE BILETU " + (i + 1) + " #########");
            tickets.add(TicketUtils.createTicket());
        }

        for (Ticket ticket : tickets) {
            ticket.showFullInfo();
        }
    }
}
