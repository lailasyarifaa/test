//balok.java
package modul2.bangun3D;

import modul2.LKbangun3D;
public class balok extends LKbangun3D{
    private double panjang;
    private double lebar;
    private double tinggi;
    public balok(){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    @Override
    public void hitungVolume(){
        volume = panjang * lebar * tinggi;
    }
}
