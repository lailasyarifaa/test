package modul4.Tugas4;

import java.lang.reflect.Method;

public class Cashier {
    private float currentPrice;
    private float currentDiscount;
    private float total;

    public float getTotal(Item selectedItem, int quantity) {
        return total;
    }
    public void setPrice(float Price) {
        currentPrice = Price;
    }

    public void setDiscount(float Discount) {
        currentDiscount = Discount;
    }
    public void calculateTotal(){
        total = currentPrice - (currentPrice * currentDiscount);
    }
    public void resetTotal(){
        total = 0;
    }

    public float getDiscount() {
        return 0;
    }

    public void setDiscount(Method[] methods) {
    }
}
