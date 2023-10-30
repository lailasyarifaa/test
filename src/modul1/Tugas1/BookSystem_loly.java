package modul1.Tugas1;

import java.util.Scanner;

class BookSystem_loly{
    private String nama,NoTelp,alamat,email;
    private final int[][] room = {{0,203,1000000},{1,204,25000}};
    private int roomDipilih;
    Scanner input = new Scanner(System.in);
    // Setter getter untuk nama
    public void setNama(String nama){
        this.nama = nama ;
    }
    public String getNama(){
        return this.nama;
    }
    //end getter nama
    //setter untuk no telp
    public void setNoTelp(String NoTelp){
        this.NoTelp = NoTelp;
    }

    //end getter no telp
    //setter getter email
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    //end setter
    //setter getter alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return this.alamat;
    }
    //end setter getter
    public void dispPerson(){
        System.out.println("Nama : " + this.getNama());
        System.out.println("Email : " + this.getEmail());
        System.out.println("No Telp : " + this.getNama());
        System.out.println("Alamat : " + this.getAlamat());
        System.out.println("No Kamar : " + this.room[this.roomDipilih][1]);
        System.out.println("Harga Kamar : " + this.room[this.roomDipilih][2]);

    }
    public void bookRoom(){
        int number =0;
        int checkRoom;
        String checkAvailable = "Tersedia";
        do{
            System.out.println("KKK Hotel");
            for (int[] ints : room) {
                if (ints[0] == 1) {
                    checkAvailable = "Tidak Tersedia";
                }
                System.out.println(number + 1 + "\t" + ints[1] + "\t" + ints[2] + "\t" + checkAvailable);
                number++;
            }
            System.out.print("Pilih Kamar Tersedia : ");
            this.roomDipilih = input.nextInt() - 1;
            if (room[roomDipilih][0] == 1) {
                System.out.println("Room Tidak Tersedia");
            }
            else{
                this.dispPerson();
                this.doPayment();
            }
            System.out.println("Ingin Memesan Kamar Lagi 0/1 ? ");
            checkRoom = input.nextInt();
        }while(checkRoom == 1);
    }
    public void getRoom(){
        this.room[this.roomDipilih][0] = 1;
    }
    public void doPayment(){
        System.out.print("Masukkan Uang Anda : ");
        this.getRoom();
    }

    public void init(){

        do{
            System.out.println("Masukkan Nama Anda : ");
            setNama(input.nextLine());
            if (!this.nama.matches("[a-zA-Z]+")) {
                System.out.print("Inputan Tidak Sesuai");
            }
        }while(!this.nama.matches("[a-zA-Z]+"));
        do{
            System.out.print("Masukkan No Telp Anda (+62): ");
            setNoTelp(input.nextLine());
            if (!this.NoTelp.matches("[+]+[0-9]+")) {
                System.out.println("Kode Negara +62 Dan Harus Berupa Huruf");
            }
        }while(!this.NoTelp.matches("[+]+[0-9]+"));
        do{
            System.out.print("Masukkan Email Anda (umm email): ");
            setEmail(input.nextLine());
            if (!this.email.toLowerCase().matches("(.*)@webmail.umm.ac.id")){
                System.out.println("Email Harus Webmail Dari Umm");
            }
        }while(!this.email.toLowerCase().matches("(.*)@webmail.umm.ac.id"));

        System.out.print("Masukkan Alamat Anda");
        setAlamat(input.nextLine());
    }

    static class run {

        public static void main(String[] args) {
            BookSystem_loly objek1 = new BookSystem_loly();
            objek1.init();
            objek1.bookRoom();
        }
    }
}
