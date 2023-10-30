package modul3.Tugas3;

import java.util.Scanner;

public class User {
    private String namaUser;
    private String passwordUser;
    private int roleUser;
    private boolean statusUser;

    private boolean admin;
    private int userIndex;
    private Object[][] userDB;

    public User() {
        this.namaUser = "";
        this.passwordUser = "";
        this.roleUser = -1;
        this.statusUser = false;
        this.admin = false;
        this.userIndex = -1;
        this.userDB = new Object[][] {
                {"admin", "admin", 0, true},
                {"202210370311441", "UMM_i2022", 1, true},
                {"202210370311442", "UMM_i2022", 1, false}
        };
    }

    //Getter dan Setter
    public String getNamaUser() {
        return namaUser;
    }
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    public int getRoleUser() {
        return roleUser;
    }
    public void setRoleUser(int roleUser) {
        this.roleUser = roleUser;
    }
    public boolean isStatusUser() {
        return statusUser;
    }
    public void setStatusUser(boolean statusUser) {
        this.statusUser = statusUser;
    }
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public int getUserIndex() {
        return userIndex;
    }
    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }
    public Object[][] getUserDB() {
        return userDB;
    }
    public void setUserDB(Object[][] userDB) {
        this.userDB = userDB;
    }

    //Method untuk login
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        boolean found = false;
        for (int i = 0; i < userDB.length; i++){
            if (userDB[i][0].equals(username) && userDB[i][1].equals(password)){
                this.namaUser = namaUser;
                this.passwordUser = passwordUser;
                this.roleUser = (int) this.userDB[i][2];
                this.statusUser = (boolean) this.userDB[i][3];
                this.userIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Login Berhasil");
            dashboard();
        }else {
            System.out.println("Login Gagal");
        }
    }

    //Method untuk Dashboard
    public void dashboard(){
        Scanner input = new Scanner(System.in);

        if (this.roleUser == 0){
            System.out.println("========= DASHBOARD =========");
            System.out.println("============================");
            System.out.println("Sistem Akademik UMM | Admin");
            System.out.println("1. Updater Status Mahasiswa");
            System.out.println("2. Updater Password Mahasiswa");
            System.out.println("3. LogOut");

            System.out.println("pilih menu :");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    updateStatus();
                    break;
                case 2:
                    updatePassword();
                    break;
                case 3:
                    System.out.println("Berhasil LogOut");
                    login();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    dashboard();
                    break;
            }
        }else if (this.roleUser == 1){
            System.out.println("============================");
            System.out.println("Sistem Akademik UMM | Mahasiswa");
            System.out.println("Username :" + this.getUserDB()[getUserIndex()][0]);
            System.out.println("Password :" + ((this.getUserDB()[getUserIndex()][3] == "true") ? "Aktif":"Tidak Aktif"));
            System.out.println("Status Mahasiswa :" + this.statusUser);
            System.out.println("1. Ubah Password");
            System.out.println("2. LogOut");

            System.out.println("Pilih menu :");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    updatePassword();
                    break;
                case 2:
                    this.namaUser = "";
                    this.passwordUser = "";
                    this.roleUser = -1;
                    this.statusUser = false;
                    System.out.println("Berhasil LogOut");
                    break;
                default:
                    System.out.println("pilihan tidak valid!");
                    dashboard();
                    break;
            }
        }else {
            System.out.println("Role user tidak valid");
        }
    }
    public void updateStatus(){
        if (isAdmin()){
            System.out.println("Anda tidak berhak untuk mengakses situs ini!");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa :");
        String namaMahasiswa = scanner.nextLine();

        boolean found = false;
        for (int i = 1; i < getUserDB().length; i++){
            if (getUserDB()[i][0].equals(namaMahasiswa)){
                found = true;
                System.out.println("Update Status mahasiswa" + userDB[i][0] + "saat ini" + userDB[i][3]);
                System.out.println("1. Aktif");
                System.out.println("2, Tidak Aktif");
                boolean newStatus = scanner.nextBoolean();
                userDB[i][3] = newStatus;
                System.out.println("Berhasil mengubah Status Mahasiswa" + namaMahasiswa + "Menjadi" + newStatus);
                break;
            }
        }
        if (!found){
            System.out.println("Mahasiswa dengan Nama :" + namaMahasiswa + "tidak ditemukan");
        }
    }
    public void updatePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Password lama :");
        String oldPassword = scanner.nextLine();

        if (getUserDB()[getUserIndex()][1].equals(oldPassword)){
            System.out.println("Password lama salah");
            return;
        }
        System.out.println("Masukkan Passsword Baru");
        String newPassword = scanner.nextLine();

        if (isPassSymbols(newPassword) || isPassDigit(newPassword) || isPassUpperCase(newPassword) || isPassLowerCase(newPassword)){
            System.out.println("PASSWORD HARUS TERDIRI DARI MINIMAL 1 SYMBOL, 1 DIGIT, 1 HURUF BESAR, dan 1 HURUF KECIL");
            return;
        }
        System.out.println("Masukkan kembali password baru :");
        String confirmPassword = scanner.nextLine();

        if (newPassword.equals(confirmPassword)){
            System.out.println("Password tidak sama");
            return;
        }

        getUserDB()[getUserIndex()][1] = newPassword;
        System.out.println("Password berhasil diUpdate");
    }
    public boolean isPassSymbols(String passwordUser){
        String symbols = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for (int i = 0; i < passwordUser.length(); i++) {
            if (passwordUser.indexOf(symbols.charAt(i)) >= 0){
                return true;
            }
        }
        return false;
    }
    public boolean isPassDigit(String passwordUser){
        for (int i = 0; i < passwordUser.length(); i++) {
            if (Character.isDigit(passwordUser.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public boolean isPassUpperCase(String passwordUser){
        for (int i = 0; i < passwordUser.length(); i++) {
            if (Character.isUpperCase(passwordUser.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public boolean isPassLowerCase(String passwordUser){
        for (int i = 0; i < passwordUser.length(); i++) {
            if (Character.isUpperCase(passwordUser.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.dashboard();
        user.updatePassword();
        user.updateStatus();
    }
}
