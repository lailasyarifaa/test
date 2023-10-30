package modul5.Tugas5;

public class Water extends Element{
    public Water(String name){
        super(name);
    }
    @Override
    public void useElement(){
        System.out.println("Element damage: Water");
    }
    @Override
    public void totalDamage(Weapon use){
        double hasil = use.damage + additionalPoint;
        System.out.println("Total damage weapon: " + hasil);
    }
    @Override
    public void weaponDamage(){
        System.out.println("Weapon damage: " + additionalPoint);
        super.weaponDamage();
    }
}
