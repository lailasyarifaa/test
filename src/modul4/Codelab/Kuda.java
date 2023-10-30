package modul4.Codelab;

import modul4.Codelab.Hewan;
import modul4.Codelab.IHerbivora;

public class Kuda extends Hewan implements IHerbivora {
    private String jenisMakanan = "Tumbuhan";
    public String getJenisMakanan(){
        return jenisMakanan;
    }
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
    @Override
    public void tampilkanMakanan(){
        System.out.println("Makanan :" + jenisMakanan);
    }
    @Override
    public void getInfo(){
        System.out.println("Hewan : Kuda");
        System.out.println("Jenis : Herbivora");
        tampilkanMakanan();
        System.out.println("Suara : " + getSuara());
    }
}
