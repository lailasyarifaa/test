//persegi.java
package modul2.bangun2d;

import modul2.Lkbangun2D;

public class persegi extends Lkbangun2D {
    private double sisi;
    public persegi(){
        this.sisi = sisi;
    }
    @Override
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    @Override
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
}
