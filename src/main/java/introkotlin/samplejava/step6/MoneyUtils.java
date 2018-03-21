package introkotlin.samplejava.step6;

import java.util.concurrent.ThreadLocalRandom;

public final class MoneyUtils {

    private MoneyUtils() {
    }

    public Money toBitcoin(Money money) {
        final double changeRate = ThreadLocalRandom.current().nextDouble(0, 0.001) + 0.001;
        return new Money(money.getValue() * changeRate, "BITCOIN");
    }

}
