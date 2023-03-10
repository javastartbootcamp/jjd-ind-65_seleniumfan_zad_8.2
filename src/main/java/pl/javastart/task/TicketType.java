package pl.javastart.task;

public enum TicketType {
    ONLINE("bilet intenetowy"),
    STANDARD("bilet standardowy"),
    GIFT("bilet prezentowy");

    TicketType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}

