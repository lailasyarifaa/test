//kubus.java
package modul2.bangun3D;

import modul2.LKbangun3D;
public class kubus extends LKbangun3D{
    private double sisi;
    public kubus (){
        this.sisi = sisi;
    }
    @Override
    public void hitungVolume(){
        volume = Math.pow(sisi, 3);
    }
}
