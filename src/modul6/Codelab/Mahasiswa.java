package modul6.Codelab;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mahasiswa {
    private String nim;
    private String name;
    private String email;
    private void setName(String name) throws InvalidNameException {
        if (!isvalidName(name)){
            throw new InvalidNameException("Nama hanya boleh mengandung huruf alfabet.");
        }
        this.name = name;
    }
    private void setNIM(String nim) throws InvalidNIMException {
        if (!isvalidNIM(nim)){
            throw new InvalidNIMException("NIM tidak valid. NIM harus terdiri dari kurang lebih atau 15 digit angka dan dimulai dengan 10370311.");
        }
        this.nim = nim;
    }
    private void setEmail(String email) throws InvalidEmailException {
        if (!isvalidEmail(email)){
            throw new InvalidEmailException("Email tidak valid.");
        }
        this.email = email;
    }
    private boolean isvalidName(String name){
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s]+$");
        return pattern.matcher(name).matches();
    }
    private boolean isvalidNIM(String nim){
        Pattern pattern = Pattern.compile("^10370311\\d{3}$");
        return pattern.matcher(nim).matches();
    }
    private boolean isvalidEmail(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        return pattern.matcher(email).matches();
    }
    public void inputDataDiri(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan Nama : ");
                setName(scanner.nextLine());

                System.out.print("Masukkan NIM  : ");
                setNIM(scanner.nextLine());

                System.out.print("Masukkan Email: ");
                setEmail(scanner.nextLine());

                System.out.println("\n<<DATA DIRI MAHASISWA INFORMATIKA>>");
                System.out.println("Nama    : " + name);
                System.out.println("NIM     : " + nim);
                System.out.println("Email   : " + email);
                break;
            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
            } catch (InvalidNIMException e) {
                System.out.println(e.getMessage());
            } catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }
}
