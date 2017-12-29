package object_orientation_abusers.switch_statement.replace_conditional_with_polymorphism;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = Arrays.asList(
                new AfricanBird(),
                new EuropeanBird(),
                new NorwegianBlueBird()
        );
        for (Bird bird : birds)
            System.out.println(bird.getSpeed());
    }
}
