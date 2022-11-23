package org.example;

import java.util.Locale;
import java.util.Scanner;

public class UAP {
    public static void main(String[] args) {
        Scanner inputMenu = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        //var log cred
        boolean terdaftar = false;
        String nama=null;
        String NIM=null;
        String username=null;

        //menu pertama
        int menu;
        do {
            menuAdministrasi();
            menu = inputMenu.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("nama");
                    nama = inputStr.nextLine();
                    System.out.print("NIM");
                    NIM = inputStr.nextLine();
                    username = namaAkhir(nama);
                    break;
                case 2:
                    System.out.print("user");
                    String loginUsername=inputStr.nextLine();
                    System.out.print("pass");
                    String loginPass=inputStr.nextLine();
                    terdaftar=login(loginUsername,loginPass,username,NIM);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:

            }
        } while (menu != 3);


        //daftar dan login

        //menu selanjutnya
        daftarBuku();
        pinjamBuku();
        requestBuku();
    }

    public static void menuAdministrasi() {
        System.out.println("=====Perpustakaan THOGC=====");
        System.out.println("1. Daftar\n2. Login");
        System.out.println("Pilih menu : ");
    }

    public static String namaAkhir(String namaLengkap) {
        String namapembagi[] = namaLengkap.split(" ");
        String username = namapembagi[namapembagi.length - 1].toLowerCase(Locale.ROOT);
        return username;
    }

    public static boolean login(String user,String pass,String dataUser, String PassUser){
        boolean terdaftar=false;
        if(user.equals(dataUser)&&pass.equals(PassUser)){
            terdaftar=true;
        }else {
            Error();
        }
        return terdaftar;
    }

//    public static void daftar(){
//        nama = anjay;
//    }

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
}