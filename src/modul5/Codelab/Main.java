package modul5.Codelab;

public class Main {
    public static void main(String[] args) {
        Plant plant = new Plant();

        Armor armor = new Armor(100);
        ArmoredZombie zombie = new ArmoredZombie(100,armor);

        System.out.println("====== Zombi Sebelum Diserang ======");
        zombie.getZombieInfo();



        System.out.println("====== Plant manyerang ArmoredZombie ======");
        for (int i = 0; i < 5; i++){
            plant.attack(zombie);
            zombie.getZombieInfo();
        }
        plant.attack(zombie);
    }

}
