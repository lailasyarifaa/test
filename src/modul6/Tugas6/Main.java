package modul6.Tugas6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku: ");
        int jumlahSuku = input.nextInt();
        DeretInteger DeretInteger = new DeretInteger(jumlahSuku);

        DeretInteger deret = new DeretInteger (jumlahSuku);
        deret.input();

        deret.ascending();
        deret.descending();
        deret.maksimal();
        deret.minimal();
    }
}
