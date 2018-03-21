package introkotlin.samplejava.step3;

import com.google.common.base.MoreObjects;

import java.util.Objects;

/**
 * Le bon Value Object en Java.
 */
public final class Money {

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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("value", value)
            .add("currency", currency)
            .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Money other = (Money) obj;
        return other.value == value && Objects.equals(currency, other.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }

}

