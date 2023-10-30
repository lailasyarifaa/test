package modul4.Codelab;

import modul4.Codelab.Hewan;
import modul4.Codelab.IKarnivora;

public class Kucing extends Hewan implements IKarnivora {
    private String jenisMakanan = "Daging";
    public String getJenisMakanan(){
        return jenisMakanan;
    }
    public void setJenisMakanan(){
        this.jenisMakanan = jenisMakanan;
    }
    @Override
    public void tampilkanMakanan(){
        System.out.println("Makanan : " + jenisMakanan);
    }
    @Override
    public void getInfo(){
        System.out.println("Hewan : Kucing");
        System.out.println("Jenis : Karnivora");
        tampilkanMakanan();
        System.out.println("Suara : " + getSuara());
    }
}
