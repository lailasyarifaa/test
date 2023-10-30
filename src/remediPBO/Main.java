package remediPBO;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer();

        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        employer.pay(eBill);
        System.out.println("==========================");

        PermanentEmployee pEmployee = new PermanentEmployee("Loly", 500);
        employer.showEmployee(pEmployee);
        System.out.println("==========================");

        InternEmployee iEmployee = new InternEmployee("Gemiyakii", 3);
        employer.showEmployee(iEmployee);
        System.out.println("==========================");
    }
}
