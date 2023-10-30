package modul4.Codelab;

public abstract class Hewan {
    private String suara;
    public String getSuara(){
        return suara;
    }
    public void setSuara(String suara){
        this.suara = suara;
    }
    public abstract void getInfo();
}
