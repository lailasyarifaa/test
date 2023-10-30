//belahKetupat.java
package modul2.bangun2d;

import modul2.Lkbangun2D;

public class belahKetupat extends Lkbangun2D {
    private double diagonal1;
    private double diagonal2;
    private double sisi;
    public belahKetupat (){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }
    public double getDiagonal1() {
        return diagonal1;
    }

    @Override
    public void hitungLuas(){
        luas = (diagonal1 * diagonal2) / 2;
    }
    @Override
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
}
