package modul6.Tugas6;

import java.util.Arrays;
import java.util.Scanner;

public class DeretInteger {
    private int[] deret;

    public DeretInteger(int jumlahSuku) {
        deret = new int[jumlahSuku];
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < deret.length; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
                    int inputan = Integer.parseInt(scanner.nextLine());
                    if (inputan < 0) {
                        throw new NegativeNumberException("Bilangan negatif tidak diizinkan.");
                    }
                    if (inputan == 0) {
                        throw new IllegalArgumentException("Bilangan 0 tidak diizinkan.");
                    }
                    deret[i] = inputan;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan harus berupa bilangan integer.");
                } catch (NegativeNumberException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void ascending() {
        try {
            int[] sortedDeret = Arrays.copyOf(deret, deret.length);
            Arrays.sort(sortedDeret);
            System.out.println("Deret ascending: " + Arrays.toString(sortedDeret));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public void descending() {
        try {
            int[] sortedDeret = Arrays.copyOf(deret, deret.length);
            Arrays.sort(sortedDeret);
            reverseArray(sortedDeret);
            System.out.println("Deret descending: " + Arrays.toString(sortedDeret));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public void maksimal() {
        try {
            int max = deret[0];
            for (int i = 1; i < deret.length; i++) {
                if (deret[i] > max) {
                    max = deret[i];
                }
            }
            System.out.println("Nilai maksimal: " + max);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public void minimal() {
        try {
            int min = deret[0];
            for (int i = 1; i < deret.length; i++) {
                if (deret[i] < min) {
                    min = deret[i];
                }
            }
            System.out.println("Nilai minimal: " + min);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
