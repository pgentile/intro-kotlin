package introkotlin.samplejava.step6;

import java.util.concurrent.ThreadLocalRandom;

public final class MoneyUtils {

    private MoneyUtils() {
    }

    public static Money toBitcoin(Money money) {
        final double exchangeRate = ThreadLocalRandom.current().nextDouble(0, 0.001);
        return new Money(money.getValue() * exchangeRate, "BITCOIN");
    }

}
