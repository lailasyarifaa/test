package modul5.Tugas5;

public class Armor extends Element implements Armorable{
    protected double defensePoint = 1000;
    public Armor(String name){
        super(name);
    }
    @Override
    public void userArmor(){System.out.println("Armor defense: " + defensePoint);}
    @Override
    public void weaponDamage(){super.weaponDamage();}
    @Override
    public void useElement(){

    }
    public void totalDamage(Element use){
        double hasil = defensePoint + use.additionalPoint;
        System.out.println("Total armor defense: " + hasil);
        super.totalDamage(use);
    }
}
