package modul2;

import java.util.Scanner;
import modul2.bangun2d.*;
import modul2.bangun3D.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        System.out.println(">>>Selamat Datang di Aplikasi Hitung Bangun Datar dan Ruang<<<");
        System.out.println("MENU");
        System.out.println("1. Menghitung Bangun 2 Dimensi");
        System.out.println("2. Menghitung Bangun 3 Dimensi");
        System.out.println("0. Keluar");
        System.out.println("Pilih Menu : ");
            menu = input.nextInt();

        if (menu == 1){
            hitung2D();
        } else if (menu == 2) {
            hitung3D();
        }else
            System.out.println("Pilihan tidak valid");
    }

    public static void hitung2D() {
        Scanner input = new Scanner(System.in);
        int pilihan;
        //double panjang, lebar, tinggi, sisi, diagonal1, diagonal2, jarijari, alas, sisimiring;
            System.out.println("HITUNG BANGUN DATAR");
            System.out.println("===================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Belah Ketupat");
            System.out.println("4. Jajargenjang");
            System.out.println("5. Lingkaran");
            System.out.println("6. Segitiga");
            System.out.println("Masukkan Pilihan :");
                pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    persegi persegi = new persegi();
                    System.out.println("Masukkan sisi :");
                    double sisi = input.nextDouble();
                    System.out.println("Luas :" + persegi.getLuas());
                    System.out.println("Keliling :" + persegi.getKeliling());
                    break;
                case 2:
                    persegiPanjang persegiPanjang = new persegiPanjang();
                    System.out.println("Masukkan panjang :");
                    double panjang = input.nextDouble();
                    System.out.println("Masukkan lebar :");
                    double lebar = input.nextDouble();
                    System.out.println("Luas Persegi Panjang:" + persegiPanjang.getLuas());
                    System.out.println("Keliling Persegi Panjang :" +persegiPanjang.getKeliling());
                    break;
                case 3:
                    belahKetupat belahKetupat = new belahKetupat();
                    System.out.println("Masukkan Sisi :");
                    sisi = input.nextDouble();
                    System.out.println("Masukkan Diagonal1 :");
                    double diagonal1 = input.nextDouble();
                    System.out.println("Masukkan Diagonal2 :");
                    double diagonal2 = input.nextDouble();
                    System.out.println("Luas Belah Ketupat :" + belahKetupat.getLuas());
                    System.out.println("keliling Belah Ketupat :" + belahKetupat.getKeliling());
                    break;
                case 4:
                    jajargenjang jajargenjang = new jajargenjang();
                    System.out.println("Masukkan Alas :");
                    double alas = input.nextDouble();
                    System.out.println("Masukkan Tinggi :");
                    double tinggi = input.nextDouble();
                    System.out.println("Masukkan Sisi miring :");
                    double sisimiring = input.nextDouble();
                    System.out.println("Luas Jajargenjang :" + jajargenjang.getLuas());
                    System.out.println("Keliling Jajargenjang :" + jajargenjang.getKeliling());
                    break;
                case 5:
                    lingkaran lingkaran = new lingkaran();
                    System.out.println("Masukkan jarijari :");
                    double jarijari = input.nextDouble();
                    System.out.println("Luas Lingkaran :" + lingkaran.getLuas());
                    System.out.println("Keliling Lingkaran :" + lingkaran.getKeliling());
                    break;
                case 6:
                    segitiga segitiga = new segitiga();
                    System.out.println("Masukkan Alas :");
                    alas = input.nextDouble();
                    System.out.println("Masukkan Tinggi :");
                    tinggi = input.nextDouble();
                    System.out.println("Masukkan Sisi1 :");
                    double sisi1 = input.nextDouble();
                    System.out.println("Masukkan Sisi2 :");
                    double sisi2 = input.nextDouble();
                    System.out.println("Masukkan Sisi3 :");
                    double sisi3 = input.nextDouble();
                    System.out.println("Luas Segitiga :" + segitiga.getLuas());
                    System.out.println("Keliling Segitiga :" + segitiga.getKeliling());
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");

            }
    }
    public static void hitung3D(){
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("HITUNG VOLUME BANGUN RUANG");
        System.out.println("===================");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Bola");
        System.out.println("4. Kerucut");
        System.out.println("5. Tabung");
        System.out.println("Masukkan Pilihan :");
            pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                balok balok = new balok();
                System.out.println("Masukkan Panjang :");
                double panjang = input.nextDouble();
                System.out.println("Masukkan Lebar :");
                double lebar = input.nextDouble();
                System.out.println("Masukkan Tinggi :");
                double tinggi = input.nextDouble();
                System.out.println("Volume Balok :" + balok.getVolume());
                break;
            case 2:
                kubus kubus = new kubus();
                System.out.println("Masukkan Sisi :");
                double sisi = input.nextDouble();
                System.out.println("Volume Kubus :" + kubus.getVolume());
                break;
            case 3:
                bola bola = new bola();
                System.out.println("Masukkan Jari jari :");
                double jarijari = input.nextDouble();
                bola.hitungVolume();
                System.out.println("Volume Bola :" + bola.getVolume());
                break;
            case 4:
                System.out.println("Masukkan Jarijari :");
                jarijari = input.nextDouble();
                kerucut kerucut = new kerucut();
                System.out.println("Masukkan Tinggi :");
                tinggi = input.nextDouble();
                System.out.println("Volume Kerucut :" + kerucut.getVolume());
                break;
            case 5:
                tabung tabung = new tabung();
                System.out.println("Masukkan Jarijari");
                jarijari = input.nextDouble();
                System.out.println("Masukkan Tinggi :");
                tinggi = input.nextDouble();
                System.out.println("Volume Tabung :" + tabung.getVolume());
                break;
            default:
                System.out.println("Plihan Tidak Valid");
        }
    }

}
