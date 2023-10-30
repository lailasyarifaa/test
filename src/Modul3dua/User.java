package Modul3dua;

import java.util.Scanner;

public class User {
    private Boolean admin = false;
    private int userIndex;
    private String userDB[][] = {
            {"admin", "admin","0","true"},
            {"202210370311441","UMM_i2022","1","true"},
            {"202210370311442","UMM_i2021","1","false"}
    };
    private String newPw,srchUser;
    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setUserDB(int argIndex1d ,int argIndex, String argValue) {
        this.userDB[argIndex1d][argIndex] = argValue;
    }
    public String[][] getUserDB() {
        return userDB;
    }
    private Scanner objInput = new Scanner(System.in);
    protected void login() {
        String tmpUsername = "",
                tmpPassword = "";
        boolean check = false;
        System.out.print("Masukkan Username : ");
        tmpUsername = objInput.next();
        System.out.print("Masukkan Password : ");
        tmpPassword = objInput.next();
        for (int i = 0; i < this.getUserDB().length; i++) {
            if (tmpUsername.equalsIgnoreCase(this.getUserDB()[i][0]) && tmpPassword.equalsIgnoreCase(this.getUserDB()[i][1])){
                check = true;
                this.setUserIndex(i);
                this.dashboard();
                break;
            }
        }
        if (!check) {
            System.out.println("User Tidak Ditemukan");
        }
    }
    protected void navMhs(String argIsMhs){
        if (argIsMhs == "1") {
            System.out.println("Username\t: "+this.getUserDB()[getUserIndex()][0]);
            System.out.println("Status Mahasiswa \t: "+((this.getUserDB()[getUserIndex()][3] == "true") ? "Aktif":"Tidak Aktif"));
        }
        else{
            this.setAdmin(true) ;
        }
    }
    protected void panelAdmin(){
        System.out.println("1.Update Status Mahasiswa");
        System.out.println("2.Update Password Mahasiswa");
        System.out.println("0.Logout");
    }
    protected void panelMhs(){
        System.out.println("1.Update Password");
        System.out.println("0.Logout");
    }
    protected void dashboard(){
        int pil;
        System.out.println("Sistem Akademik UMM | "+ ((this.getUserDB()[getUserIndex()][2] == "0" ) ? "Admin" : "Mahasiswa"));
        this.navMhs(this.getUserDB()[getUserIndex()][2]);
        if (this.getUserDB()[this.getUserIndex()][2] == "0") { this.panelAdmin(); } else { this.panelMhs();}
        System.out.print("Pilih Menu : ");
        pil = objInput.nextInt();
        boolean check = false;
        if (pil == 1 && !this.getAdmin()) {
            do {
                check = false;
                System.out.print("Input Password Baru : ");
                newPw = objInput.next();
                validation objVal = new validation(newPw);
                if (!objVal.getFreturn()) {
                    System.out.println("Password Harus Kombinasi Huruf,Angka,Symbol Dan Uppercase");
                    check = true;
                }else{
                    this.setUserDB(this.getUserIndex(),1,newPw);
                    System.out.println("Password Berhasil Di Ubah!");
                    this.dashboard();
                }
            }while(check);
        }
        if (pil == 1 && this.getAdmin()) {
            int tmpStatus;
            System.out.print("Masukkan Nama User : ");
            this.srchUser = objInput.next();
            for (int i = 0; i < this.getUserDB().length ; i++) {
                if (srchUser.equalsIgnoreCase(this.getUserDB()[i][0])) {
                    System.out.println("Ganti Status Mahasiswa : ");
                    System.out.println("1.Aktif\n2.Tidak Aktif");
                    System.out.print("Pilih Menu : ");
                    tmpStatus = objInput.nextInt();
                    this.setUserDB(i,3,(tmpStatus == 1)? "true" :  "false");
                    System.out.println("Sukses Mengganti Status User");
                    this.dashboard();
                    break;
                }
            }
        }
        if (pil == 2 && this.getAdmin()) {
            String tmpPassword;
            boolean cU = false;
            System.out.print("Masukkan Nama User : ");
            this.srchUser = objInput.next();
            for (int i = 0; i < this.getUserDB().length ; i++) {
                if (srchUser.equalsIgnoreCase(this.getUserDB()[i][0])) {
                    do {
                        cU = false;
                        System.out.print("Masukkan Password Baru : ");
                        tmpPassword = objInput.next();
                        validation objValidation = new validation(tmpPassword);
                        if (objValidation.getFreturn()) {
                            this.setUserDB(i,1, tmpPassword);
                            System.out.println("Sukses Mengganti Password User");
                            this.dashboard();
                        } else {
                            System.out.println("Password Harus Kombinasi Huruf,Angka,Symbol Dan Uppercase");
                            cU = true;
                        }
                    }while(cU);
                }
            }
        }
        if (pil == 0) {
            this.setAdmin(false);
            this.logout();

        }
    }
    protected void logout(){
        this.login();
    }
    public static void main(String[] args) {
        User objUser = new User();
        objUser.login();
    }
}
