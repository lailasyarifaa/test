package modul5.Codelab;

import modul5.Codelab.Destroyable;

public class Zombie implements Destroyable {
    protected int health;
    public Zombie(int health){
        this.health = health;
    }
    public void destroyed(){
        System.out.println("====== Zombie Mati ======");
    }
    public void getZombieInfo(){
        System.out.println("====== Zombie Info ======");
        System.out.println("Zombie: " + this.getClass().getSimpleName());
        System.out.println("Health: " + health);
    }

}
