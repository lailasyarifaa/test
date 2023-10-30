package modul4.Tugas4;

public class Gitar extends Item implements AlatMusik{
    public Gitar(String brand, String model, String price, boolean onSale, int stock, float discount){
        super(brand,model,price,onSale,stock,discount);
    }

    //Implementasi method dari interface AlatMusik
    public float getMaxDiscount(){
        return MAX_DISCOUNT;
    }

    @Override
    public float getDiscountPrice(float price, float discount) {
        float maxDiscount = price * MAX_DISCOUNT;
        if (discount > maxDiscount){
            discount = maxDiscount;
        }
        return price - discount;
    }

    @Override
    public void tampilkanAlatMusik(){
        System.out.println("Ini adalah Gitar");
    }
}
