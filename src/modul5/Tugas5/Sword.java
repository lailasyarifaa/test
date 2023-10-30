package modul5.Tugas5;

public class Sword extends Weapon implements Weaponable{
    public Sword(String name){
        super(name);
    }
    @Override
    public void useWeaponable(){
        System.out.println("Weapon: " + name);
    }
    @Override
    public void weaponDamage(){
        System.out.println("Weapon damage: " + damage);
    }
}
