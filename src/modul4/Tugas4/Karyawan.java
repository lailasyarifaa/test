package modul4.Tugas4;

public class Karyawan extends Person {
    public static final float DISCOUNT = 0.125f;

    private boolean isEmployee;

    public Karyawan(String name, boolean isEmployee) {
        super(name);
        this.isEmployee = isEmployee;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public float getEmployeeDiscount() {
        return isEmployee ? DISCOUNT : 0f;
    }
}
