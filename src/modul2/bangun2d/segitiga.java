package modul2.bangun2d;

import modul2.Lkbangun2D;

public class segitiga extends Lkbangun2D {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    public segitiga (){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }
    @Override
    public void hitungLuas(){
        luas = (alas * tinggi) / 2;
    }
    @Override
    public void hitungKeliling(){
        keliling = sisi1 + sisi2 + sisi3;
    }
}
