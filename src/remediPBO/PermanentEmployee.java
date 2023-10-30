package remediPBO;

public class PermanentEmployee extends Employee implements Payable{
    private int salary;
    public PermanentEmployee(String name, int salary){
        super(name);
        this.salary = salary;
    }
    public int getPaymentAmount(){
        return (int) (salary + (salary * 0.05));
    }

    @Override
    public int getBasePrice() {
        return 0;
    }

    @Override
    public String getBillInfo() {
        return null;
    }
}
