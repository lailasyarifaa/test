package modul1.Codelab;

import java.util.Scanner;
import java.util.Calendar;

public class Codelab2 {
    public static void main(String[] args) throws Exception {
        int tahun_lahir;
        int tahun_sekarang;
        int umur;
        Scanner input = new Scanner(System.in);
        Calendar kalender = Calendar.getInstance();
        tahun_sekarang = kalender.get(Calendar.YEAR);
        System.out.print("Masukkan Tahun Kelahiran: ");
        tahun_lahir = input.nextInt();
        umur = tahun_sekarang - tahun_lahir;
        System.out.println("Umur anda: " + umur );
    }
}