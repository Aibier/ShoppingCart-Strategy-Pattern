public class Leaves extends Product {
    public static final int FERN = 21;
    public static final int COCONUT = 22;

    public Leaves(int type) {
        setType(type);
        setPrice(0.10f);
    }

    public String getPrintableType() {
        switch (getType()) {
            case FERN:
                return "Leaves: Fern";
            case COCONUT:
                return "Leaves: Coconut";
        }

        return null;
    }
}
