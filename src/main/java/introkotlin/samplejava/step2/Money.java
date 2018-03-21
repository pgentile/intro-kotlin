package introkotlin.samplejava.step2;

/**
 * Un beau constructeur pour initialiser un objet valide.
 */
public class Money {

    private final double value;

    private final String currency;

    public Money(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

}
