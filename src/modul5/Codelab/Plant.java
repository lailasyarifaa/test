package modul5.Codelab;

public class Plant {
    public void attack(Destroyable d){
        d.destroyed();
        if (d instanceof Zombie){
            Zombie zombie = (Zombie) d;
            zombie.getZombieInfo();
        }
    }
}
