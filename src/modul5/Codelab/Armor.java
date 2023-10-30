package modul5.Codelab;

public class Armor implements Destroyable {
    protected int strenght;
    public Armor(int strenght){
        this.strenght = strenght;
    }

    @Override
    public void destroyed() {
        System.out.println("Armor Hancur");
    }
    public void getArmorInfo(){
        System.out.println("Armor: " + strenght);
    }

}
