import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SqlCompare {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();


        messages.add(new Message("Alien", "Hello humans!",
                32, "2034-03-25"));
        messages.add(new Message("Pirate", "All hands on deck!",
                -2, "2034-01-05"));
        messages.add(new Message("User765214", "Bump!",
                1, "2033-02-17"));
        messages.add(new Message("Unregistered", "This message was marked as spam",
                -18, "2033-01-14"));

        messages.sort(Comparator.comparingInt(o -> o.getContent().length()));
        messages.forEach(System.out::println);
        System.out.println();

        messages.sort(Comparator.comparing(Message::getLikes)
                .reversed()
                .thenComparing(Message::getFrom));
        messages.forEach(System.out::println);
    }
}

class Message {

    private final String from;
    private final String content;
    private final LocalDate created;
    private int likes;

    public Message(String from, String content, int likes, String created) {
        this.from = from;
        this.content = content;
        this.likes = likes;
        this.created = LocalDate.parse(created);
    }

    // getters and setters

    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreated() {
        return created;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return created.toString() + " " + from + " wrote: " +
                content + " (" + likes + ")";
    }
}
