package org.example;

import java.util.Locale;
import java.util.Scanner;

public class UAP {
    public static void main(String[] args) {
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        //var log cred
        boolean terdaftar = false;
        boolean loginStatus = false;
        String nama = null;
        String NIM = null;
        String username = null;

        //menu pertama
        int menu;
        do {
            System.out.println(loginStatus);
//            clear();
            menuAdministrasi();
            menu = inputMenu.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Daftarkan nama lengkap: ");
                    nama = inputStr.nextLine();
                    System.out.println("nama belakang anda akan menjadi username.");
                    System.out.print("NIM");
                    NIM = inputStr.nextLine();
                    username = namaAkhir(nama);
                    terdaftar = true;
                    break;
                case 2:
                    if (terdaftar) {
                        System.out.println("Login");
                        System.out.print("Masukan username (nama belakang) : ");
                        String loginUsername = inputStr.nextLine();
                        System.out.print("Masukan password (NIM) :");
                        String loginPass = inputStr.nextLine();
                        loginStatus = login(loginUsername, loginPass, username, NIM);
                        if (loginStatus) {
                            System.out.println("Login sukses!");
//                            garis();
//                            menuPerpus();
                        }
                    } else {
                        garis();
                        System.out.println("Anda belum mendaftar!\nHarap daftar terlebih dahulu");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:

            }
        } while (menu != 3 && !loginStatus);


        //daftar dan login

        //Daftar buku
//index = id
        String judulBuku = "Bumi";
        int jumlahBuku = 5;
        //menu selanjutnya
        int menuPerpus;
        do {
            System.out.println("====Perpustakaan THOGC====");
            System.out.println("1. Tampilkan daftar buku\n2. Pinjam Buku\n3. Request Buku\n4. Keluar");
            System.out.print("Pilih menu : ");
            menuPerpus = inputMenu.nextInt();
        } while (menuPerpus != 4);
        daftarBuku();
        pinjamBuku();
        requestBuku();
    }

    public static void menuAdministrasi() {
        System.out.println("=====Perpustakaan THOGC=====");
        System.out.println("1. Daftar\n2. Login\n3.Keluar");
        System.out.println("Pilih menu : ");
    }

    public static String namaAkhir(String namaLengkap) {
        String namapembagi[] = namaLengkap.split(" ");
        String username = namapembagi[namapembagi.length - 1].toLowerCase(Locale.ROOT);
        return username;
    }

    public static boolean login(String user, String pass, String dataUser, String PassUser) {
        boolean sama = false;
        if (user.equals(dataUser) && pass.equals(PassUser)) {
            sama = true;
        } else {
            Error();
        }
        return sama;
    }

    //    public static void daftar(){
//        nama = anjay;
//    }
    public static void menuPerpus() {
        System.out.println("msdjnakbk");
    }

    public static void daftarBuku() {

    }

    public static void pinjamBuku() {

    }

    public static void requestBuku() {

    }

    public static void clear() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }

    public static void Error() {
        System.out.println("Input salah!");
    }

    public static void garis() {
        System.out.println("====================================================================================");
    }
}