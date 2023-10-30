package modul4.Codelab;

import modul4.Codelab.*;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing();
        hewan1.setSuara("Meow Meow");
        hewan1.getInfo();
        System.out.println();

        Hewan hewan2 = new Anjing();
        hewan2.setSuara("Guk Guk");
        hewan2.getInfo();
        System.out.println();

        Hewan hewan3 = new Beruang();
        hewan3.setSuara("Graaa");
        hewan3.getInfo();
        System.out.println();

        Hewan hewan4 = new Kuda();
        hewan4.setSuara("Hiiihin");
        hewan4.getInfo();
    }
}
