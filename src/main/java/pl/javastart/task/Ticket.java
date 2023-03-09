package pl.javastart.task;

public class Ticket {
    private String event;
    private Address address;
    private TicketType type;
    private double basicPrice = 100;
    private double discount = 0.05;
    private int number;
    private static int counter = 1;

    public Ticket(String event, Address address, TicketType type) {
        this.event = event;
        this.address = address;
        this.type = type;
        this.number = counter++;
    }

    double getPrice() {
        return switch (type) {
            case ONLINE -> calculateDiscountPrice();
            case STANDARD -> calculateDiscountPriceWithServiceFee();
            case GIFT -> calculateDiscountPriceWithServiceFee() + calculateDiscountPrice() * 0.05;
        };
    }

    void showFullInfo() {
        System.out.printf("#%d %s, wydarzenie: %s, adres: %s\n" +
                        "cena podstawowa %.2f zł, zniżka %.0f%%, cena finalna: %.2f zł\n",
                number, type.getName(), event, address, basicPrice, (discount * 100), getPrice());
    }

    private double calculateDiscountPrice() {
        return basicPrice - basicPrice * discount;
    }

    private double calculateDiscountPriceWithServiceFee() {
        int serviceFee = 5;
        return calculateDiscountPrice() + serviceFee;
    }
}
