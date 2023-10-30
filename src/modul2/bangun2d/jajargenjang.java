package modul2.bangun2d;

import modul2.Lkbangun2D;

public class jajargenjang extends Lkbangun2D {
    private double alas;
    private double tinggi;
    private double sisimiring;
    public jajargenjang (){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisimiring = sisimiring;
    }
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (alas + sisimiring);
    }
}
