import java.util.Scanner;

public class Main  {
    public static void main(String[] args){

        Clock clock = new Clock();

        while (true) {
            System.out.println(clock);
            clock.advance(1);

            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

}
