import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    protected LocalDate start;
    protected LocalDate end;
    public Event(String description, LocalDate start, LocalDate end) {
        super(description, "E");
        this.start = start;
        this.end = end;
    }

    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMM dd yyyy");
        return String.format("%s | %s to %s", this.description, this.start.format(f), this.end.format(f));
    }
}
