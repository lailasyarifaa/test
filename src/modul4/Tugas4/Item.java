package modul4.Tugas4;

public abstract class Item {
    private String brand;
    private String model;
    private String price;
    private boolean onSale;
    private int stock;
    private float discount;
    public Item(String brand, String model, String price, boolean onSale, int stock, float discount){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.onSale = onSale;
        this.stock = stock;
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public abstract float getDiscountPrice(float price, float discount);
}
