package modul4.Codelab;

public class Beruang extends Hewan implements IKarnivora, IHerbivora {
    private String jenisMakanan = "Daging + Tumbuhan";
    public String getJenisMakanan(){
        return jenisMakanan;
    }
    public void setJenisMakanan(){
        this.jenisMakanan = jenisMakanan;
    }
    @Override
    public void tampilkanMakanan(){
        System.out.println("Makanan :" + jenisMakanan);
    }
    @Override
    public void getInfo(){
        System.out.println("Hewan : Beruang");
        System.out.println("Jenis : Karnivora + Herbivora");
        tampilkanMakanan();
        System.out.println("Suara : " + getSuara());
    }
}
