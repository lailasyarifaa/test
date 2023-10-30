//jarijari.java
package modul2.bangun3D;

import modul2.LKbangun3D;
public class tabung extends LKbangun3D{
    private double jarijari;
    private double tinggi;
    public tabung (){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    @Override
    public void hitungVolume(){
        volume = Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
}
