package introkotlin.samplejava.step6;

public class MoneyMain {

    public static void main(String... args) {
        final Money money = new Money(10, "EURO");
        System.out.println("Money = " + MoneyUtils.toBitcoin(money));
    }

}
