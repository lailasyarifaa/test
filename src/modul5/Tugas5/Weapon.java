package modul5.Tugas5;

public abstract class Weapon {
    protected String name;
    protected double damage;
    public Element element;
    public Weapon(String name){
        this.name = name;

        if (this instanceof Gun){
            this.damage = 100;
        } else if (this instanceof Sword) {
            this.damage = 200;
        }
    }
    public abstract void weaponDamage();
}
