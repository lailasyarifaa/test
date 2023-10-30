//lingkaran.java
package modul2.bangun2d;

import modul2.Lkbangun2D;

public class lingkaran extends Lkbangun2D {
    private double jarijari;
    public lingkaran (){
        this.jarijari = jarijari;
    }
    @Override
    public void hitungLuas(){
        luas = Math.PI * jarijari * jarijari;
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * Math.PI * jarijari;
    }
}
