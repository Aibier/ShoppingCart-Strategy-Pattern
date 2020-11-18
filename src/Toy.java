public class Toy extends Product {
    public static final int SOFTTOY = 11;
    public static final int RUBBERTOY = 12;

    public Toy(int type) {
        setType(type);
        setPrice(1.0f);
    }

    public String getPrintableType() {
        switch (getType()) {
            case SOFTTOY:
                return "Toy: Soft toy";
            case RUBBERTOY:
                return "Toy: Rubber toy";
        }
        return null;
    }
}
