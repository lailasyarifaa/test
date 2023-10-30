package modul5.Tugas5;

public abstract class Element extends Weapon {
    protected double additionalPoint;
    public Element(String name){
        super(name);

        if (this instanceof Water){
            this.additionalPoint = 200;
        } else if (this instanceof Fire) {
            this.additionalPoint = 100;
        } else if (this instanceof Wind) {
            this.additionalPoint = 300;
        } else if (this instanceof Earth) {
            this.additionalPoint = 400;
        }
    }
    public void totalDamage(Weapon use){

    }
    public abstract void useElement();
    @Override
    public void weaponDamage(){

    }
}
