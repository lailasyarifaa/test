//kerucut.java
package modul2.bangun3D;

import modul2.LKbangun3D;
public class kerucut extends LKbangun3D{
    private double jarijari;
    private double tinggi;
    public kerucut (){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    @Override
    public void hitungVolume(){
        volume = (1.0 / 3.0) * Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}
