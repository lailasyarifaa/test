package modul5.Tugas5;

public abstract class Hero {
    protected double healthPoint;
    protected double attackDamage;
    protected double defense;
    protected int level;
    protected boolean lifeStatus;
    public Hero(int level){
        this.level = level;
        this.lifeStatus = true;

        if (this instanceof Assasin) {
            this.healthPoint = 3000 + (level * 90);
            this.defense = 300 + (level * 15);
            this.attackDamage = 800 + (level * 30);
        } else if (this instanceof Tank) {
            this.healthPoint = 7000 + (level * 200);
            this.defense = 500 + (level * 15);
            this.attackDamage = 500 + (level * 20);
        } else if (this instanceof Mage) {
            this.healthPoint = 2500 + (level * 85);
            this.defense = 200 + (level * 10);
            this.attackDamage = 700 + (level * 35);
        }
    }
    public void attack(Hero target){
        System.out.println(this.getClass().getSimpleName() + "attacks" + target.getClass().getSimpleName());
        target.reviewDamage(calculaterealdamage(target));
    }
    public void reviewDamage(double damage){
        if (this instanceof Tank){
            Tank tank = (Tank) this;
            double remainingArmor = tank.checkArmor(damage);
            healthPoint -= remainingArmor;
        }else {
            healthPoint -= damage;
        }
        if (healthPoint <= 0){
            healthPoint = 0;
            lifeStatus = false;
        }
        System.out.println(this.getClass().getSimpleName() + "HP: " + healthPoint);
    }
    public void checkStatus(){
        System.out.println("Health point: " + healthPoint);
        System.out.println("Life Status: " + (lifeStatus ? "Alive" : "Defeated"));
    }
    protected abstract double calculaterealdamage(Hero target);
    protected abstract void spawnIntro();
}
