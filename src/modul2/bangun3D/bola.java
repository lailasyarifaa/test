//bola.java
package modul2.bangun3D;

import modul2.LKbangun3D;
public class bola extends LKbangun3D{
    private double jarijari;
    public bola (){
        this.jarijari = jarijari;
    }
    @Override
    public void hitungVolume(){
        volume = (4.0 / 3.0) * Math.PI * Math.pow(jarijari, 3);
    }
}
