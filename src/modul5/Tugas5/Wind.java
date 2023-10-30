package modul5.Tugas5;

public class Wind extends Element{
    public Wind(String name){
        super(name);
    }
    @Override
    public void totalDamage(Weapon use){
        double total = use.damage + additionalPoint;
        System.out.println("Total damage weapon: " + total);
    }
    @Override
    public void weaponDamage(){
        System.out.println("Weapon damage: " + additionalPoint);
        super.weaponDamage();
    }
    @Override
    public void useElement(){
        System.out.println("Element damage: Wind");
    }
}
