import java.util.Collection;
import java.util.Iterator;

// markup only Toys by 25% for Valentine�s Day
public class ValentinesDayStrategy implements PricingStrategy {

    public float calculateTotal(Collection<Product> items) {
        float total = 0.0f;
        Iterator<Product> item = items.iterator();
        while (item.hasNext()) {
            if (item.next().getType() == 11 || item.next().getType() == 12) {
                total += item.next().getPrice() * 0.75;
            } else {
                total += item.next().getPrice();
            }
        }
        return total;
    }
}
