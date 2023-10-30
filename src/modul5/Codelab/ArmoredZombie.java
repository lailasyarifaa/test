package modul5.Codelab;

public class ArmoredZombie extends Zombie {
    private Armor armor;
    public ArmoredZombie(int health, Armor armor){
        super(health);
        this.armor = armor;
    }

    @Override
    public void destroyed() {
        super.destroyed();
        armor.destroyed();
    }
    public void getZombieInfo() {
        super.getZombieInfo();
        armor.getArmorInfo();
    }
}
