import java.util.Collection;

public interface PricingStrategy {
    int REGULAR = 99;
    int VALENTINE = 0;
    int MOTHER = 1;

    float calculateTotal(Collection<Product> items);
}
