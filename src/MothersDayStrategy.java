import java.util.Collection;
import java.util.Iterator;

// markup only Flowers by 15% for Mother�s Day
public class MothersDayStrategy implements PricingStrategy {

    public float calculateTotal(Collection<Product> items) {
        float total = 0.0f;
        Iterator<Product> item = items.iterator();
        while (item.hasNext()) {
            if (item.next().getType() < 5) {
                total += item.next().getPrice() * 0.85;
            } else {
                total += item.next().getPrice();
            }
        }
        return total;
    }
}
