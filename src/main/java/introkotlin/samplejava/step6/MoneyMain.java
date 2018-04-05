package introkotlin.samplejava.step6;

import java.util.stream.IntStream;

import static introkotlin.samplejava.step6.MoneyUtils.*;

public class MoneyMain {

    public static void main(String... args) {
        IntStream.range(0, 10).forEach(i -> {
            final Money money = new Money(10, "EURO");
            System.out.println("Money = " + toBitcoin(money));
        });
    }

}
