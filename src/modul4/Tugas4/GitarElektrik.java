package modul4.Tugas4;

public abstract class GitarElektrik extends Gitar implements AlatElektronik {
    public GitarElektrik(String brand, String model, String price, boolean onSale, int stock, float discount){
        super(brand,model,price,onSale,stock,discount);
    }
}

