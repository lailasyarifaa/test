package modul5.Tugas5;

public class Earth extends Element{
    public Earth(String name){
        super(name);
    }
    @Override
    public void useElement(){
        System.out.println("Element Damage: Earth");
    }
    @Override
    public void totalDamage(Weapon use){
        double total = use.damage + additionalPoint;
        System.out.println("Total Damage Weapon: " + total);
    }
    @Override
    public void weaponDamage(){
        System.out.println("Weapon damage: " + additionalPoint);
        super.weaponDamage();
    }
}
