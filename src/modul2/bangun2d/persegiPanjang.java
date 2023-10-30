//persegiPanjang.java
package modul2.bangun2d;

import modul2.Lkbangun2D;

public class persegiPanjang extends Lkbangun2D {
    private double panjang;
    private double lebar;
    public persegiPanjang (){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public void hitungLuas(){
        luas = panjang * lebar;
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (panjang + lebar);
    }
}
