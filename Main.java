package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputMenu = new Scanner(System.in);
        //var log cred
        boolean terdaftar = false;
        String nama;
        String username;
        String NIM;

        //menu pertama
        int menu;
        do {
            menuAdministrasi();
            menu = inputMenu.nextInt();
            switch (menu){
                case 1:
                    
                    break;
                case 2:
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
    public static void Error(){
        System.out.println("Input salah!");
    }
}