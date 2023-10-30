package remediPBO;

import java.util.SplittableRandom;

public class Employer {
    public void pay(Payable p){
        int amount = p.getPaymentAmount();
        int kWh = p.getBasePrice();
        String category = p.getBillInfo();
        System.out.println("Payment Amount: " + amount);
        System.out.println("kWh: " + kWh);
        System.out.println("Category: " + category);
    }
    public void showEmployee(Employee e){
        System.out.println(e.getEmployeeInfo());
        if (e instanceof PermanentEmployee){
            System.out.println("Karyawan tetap perlu digaji !!!");
        }else {
            System.out.println("Intern tidak perlu digaji :)");
        }
    }
}
