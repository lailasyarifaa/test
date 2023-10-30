package modul4.Codelab;

public class Anjing extends Hewan implements IKarnivora {
    private String jenisMakanan = "Daging";
    public String getJenisMakanan(){
        return jenisMakanan;
    }
    public void setJenisMakanan(String jenisMakanan){
        this.jenisMakanan = jenisMakanan;
    }
    @Override
    public void tampilkanMakanan(){
        System.out.println("Makanan : " + jenisMakanan);
    }

    @Override
    public void getInfo() {
        System.out.println("Hewan : Anjing");
        System.out.println("Jenis : Karnivora");
        tampilkanMakanan();
        System.out.println("Suara : " + getSuara());
    }
}
