package modul2;

public abstract class Lkbangun2D {
    protected double luas;
    protected double keliling;

    public abstract void hitungLuas();
    public abstract void hitungKeliling();

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
