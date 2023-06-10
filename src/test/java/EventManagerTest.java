import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventManagerTest {

    @Test
    public void findAll() {
        EventManager manager = new EventManager();
        manager.addMovie("event1");
        manager.addMovie("event2");
        manager.addMovie("event3");
        manager.addMovie("event4");
        manager.addMovie("event5");

        String[] expected = {"event1", "event2", "event3", "event4", "event5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        EventManager manager = new EventManager();
        manager.addMovie("event1");
        manager.addMovie("event2");
        manager.addMovie("event3");
        manager.addMovie("event4");
        manager.addMovie("event5");

        String[] expected = {"event5", "event4", "event3", "event2", "event1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastBelowLimit() {
        EventManager manager = new EventManager();
        manager.addMovie("event1");
        manager.addMovie("event2");
        manager.addMovie("event3");
        manager.addMovie("event4");

        String[] expected = {"event4", "event3", "event2", "event1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
