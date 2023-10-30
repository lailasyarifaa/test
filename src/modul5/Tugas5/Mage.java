package modul5.Tugas5;

public class Mage extends Hero implements MagicalDamage{
    public Mage(int level){
        super(level);
        attackDamage += attackDamage * magicalDamagebonus;
    }
    @Override
    protected double calculaterealdamage(Hero target){
        double realDamage = attackDamage - target.defense;
        return realDamage >= 0 ? realDamage : 0;
    }
    @Override
    protected void spawnIntro(){
        System.out.println("Prepare to be amazed by my magic!");
    }
}
