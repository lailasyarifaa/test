package modul3.Codelab;

import modul3.Codelab.Modul3Pratice;

import java.util.Scanner;

public class Conventer extends Modul3Pratice {
        protected double setValueToM(double value){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan yard : "); double a = input.nextDouble();
            setValue(a);
            double hasil = getValue()*0.914;
            System.out.println("Hasil konversi : " +hasil);
            return 0;
        }
        protected double setValueToCM(double value){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan yard : "); double a = input.nextDouble();
            setValue(a);
            double hasil = getValue()*91.44;
            System.out.println("Hasil konversi : " +hasil);
            return 0;
        }
        protected double setValueToFeet(double value){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan yard : "); double a = input.nextDouble();
            setValue(a);
            double hasil = getValue()*3;
            System.out.println("Hasil konversi : " +hasil);
            return 0;
        }
        protected double setValueToMiles(double value){
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan yard : "); double a = input.nextDouble();
            setValue(a);
            double hasil = getValue()*0.000568;
            System.out.println("Hasil konversi : " +hasil);
            return 0;
        }
}
