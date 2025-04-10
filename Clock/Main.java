import java.util.Scanner;

public class Main(String[] args<>) {

    Clock clock = new Clock;

     while (true) {
        System.out.println(clock);
        clock.advance();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
