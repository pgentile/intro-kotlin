package introkotlin.samplejava.step6;

import java.util.stream.IntStream;

public class MoneyMain {

    public static void main(String... args) {
        IntStream.range(0, 10).forEach(x -> {
            final Money money = new Money(10, "EURO");
            System.out.println("Money = " + MoneyUtils.toBitcoin(money));
        });
    }

}
