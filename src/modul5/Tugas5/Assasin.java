package modul5.Tugas5;

public class Assasin extends Hero implements CriticalDamage{
    private String weapon;
    private String element;
    public Assasin(int level, String weapon, String element){
        super(level);
        this.weapon = weapon;
        this.element = element;

        attackDamage += attackDamage * bonusDamage;
        if (element != null){
            attackDamage += 100;
        }
    }
    @Override
    protected double calculaterealdamage(Hero target){
        double realDamage = attackDamage - target.defense;
        return realDamage >= 0 ? realDamage : 0;
    }
    @Override
    protected void spawnIntro(){
        System.out.println("Kill me if you can!!");
    }
    public void useWeapon(){
        System.out.println("Weapon: " + weapon);
    }
    public void useElement(){
        System.out.println("Weapon Element: " + element);
    }
}
