package modul5.Tugas5;

public class Tank extends Hero{
    protected double armorStrenght = 3;
    public Tank(int level){
        super(level);
    }
    @Override
    protected double calculaterealdamage(Hero target){
        double realDamage = attackDamage - target.defense;
        if (armorStrenght > 0){
            armorStrenght--;
            realDamage = 0;
        }
        return realDamage >= 0 ? realDamage : 0;
    }
    @Override
    protected void spawnIntro(){
        System.out.println("I'm an ustopable tank!!");
    }
    public double checkArmor(double damage){
        double remainingArmor = armorStrenght - damage;
        if (remainingArmor > 0){
            armorStrenght = remainingArmor;
            return 0;
        }else {
            double remainingDamage = Math.abs(remainingArmor);
            armorStrenght = 0;
            return remainingDamage;
        }
    }
}
