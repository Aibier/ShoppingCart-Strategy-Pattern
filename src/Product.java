public abstract class Product {

    private static final String _debug_prefix = "Product: ";

    private int type = 0;
    private int id = -1;
    private float price = 0.0f;
    private int qty = 0;
    private String vendor = null;

    public abstract String getPrintableType();

    protected Product() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        price = newPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        System.out.println(_debug_prefix + "Vendor changed for '" + getPrintableType() + "'");
        this.vendor = vendor;
    }


} // end of Product class
