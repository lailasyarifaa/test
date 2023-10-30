package modul1.Codelab;//import java.util.Scanner;

public class Codelab1 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        double meter, cm, mm;
        meter = 1;
        cm = meter*100;
        mm = meter*1000;
        System.out.printf("%.2f meter = ", meter);
        System.out.printf("%.2f cm, ", cm);
        System.out.printf("%.2f mm ", mm);
    }
}
