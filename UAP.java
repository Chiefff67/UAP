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
                        } else {
                            Error();
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
                    Error();

            }
        } while (menu != 3);


        //daftar dan login

        //Daftar buku
//index = id
        String judulBuku1 = "Bumi";
        int jumlahBuku1 = 9;
        String judulBuku2 = "Bulan";
        int jumlahBuku2 = 8;
        String judulBuku3 = "Matahari";
        int jumlahBuku3 = 7;
        String judulBuku4 = "Bintang";
        int jumlahBuku4 = 6;
        String judulBuku5 = "Ceroz dan Batozar";
        int jumlahBuku5 = 5;
        String judulBuku6 = "Komet";
        int jumlahBuku6 = 5;
        String judulBuku7 = "Komet Minor";
        int jumlahBuku7 = 4;
        String judulBuku8 = "Selena";
        int jumlahBuku8 = 3;
        String judulBuku9 = "Nebula";
        int jumlahBuku9 = 3;
        String judulBuku10 = "S Putih";
        int jumlahBuku10 = 2;
        String judulBuku11 = "Lumpu";
        int jumlahBuku11 = 2;
        String judulBuku12 = "Bibi Gili";
        int jumlahBuku12 = 1;
        String judulBuku13 = "Sagara";
        int jumlahBuku13 = 1;

        //menu selanjutnya
        int menuPerpus;
        do {
            System.out.println("====Perpustakaan THOGC====");
            System.out.println("1. Tampilkan daftar buku\n2. Pinjam Buku\n3. Request Buku\n4. Keluar");
            System.out.print("Pilih menu : ");
            menuPerpus = inputMenu.nextInt();
            switch (menuPerpus) {
                case 1:
                    daftarBuku();
                    break;
                case 2:
                    garis();
                    daftarBuku();
                    garis();
                    System.out.println("Pilih buku: ");
                    int indexBuku = inputMenu.nextInt();
                    switch (indexBuku){
                        case 1:
                            jumlahBuku1=pinjamBuku(jumlahBuku1);
                            System.out.println("anda meminjam "+judulBuku1);
                            System.out.println(judulBuku1+" yang tersedia sekarang sebanyak "+jumlahBuku1+" buku");
                            break;

                        case 2:
                            jumlahBuku2=pinjamBuku(jumlahBuku2);
                            System.out.println("anda meminjam "+judulBuku2);
                            System.out.println(judulBuku2+" yang tersedia sekarang sebanyak "+jumlahBuku2+" buku");
                            break;
                        case 3:
                            jumlahBuku3=pinjamBuku(jumlahBuku3);
                            System.out.println("anda meminjam "+judulBuku3);
                            System.out.println(judulBuku3+" yang tersedia sekarang sebanyak "+jumlahBuku3+" buku");
                            break;
                        case 4:
                            jumlahBuku4=pinjamBuku(jumlahBuku4);
                            System.out.println("anda meminjam "+judulBuku4);
                            System.out.println(judulBuku4+" yang tersedia sekarang sebanyak "+jumlahBuku4+" buku");
                            break;
                        case 5:
                            jumlahBuku5=pinjamBuku(jumlahBuku5);
                            System.out.println("anda meminjam "+judulBuku5);
                            System.out.println(judulBuku5+" yang tersedia sekarang sebanyak "+jumlahBuku5+" buku");
                            break;
                        case 6:
                            jumlahBuku6=pinjamBuku(jumlahBuku6);
                            System.out.println("anda meminjam "+judulBuku6);
                            System.out.println(judulBuku6+" yang tersedia sekarang sebanyak "+jumlahBuku6+" buku");
                            break;
                        case 7:
                            jumlahBuku7=pinjamBuku(jumlahBuku7);
                            System.out.println("anda meminjam "+judulBuku7);
                            System.out.println(judulBuku7+" yang tersedia sekarang sebanyak "+jumlahBuku7+" buku");
                            break;

                        case 8:
                            jumlahBuku8=pinjamBuku(jumlahBuku8);
                            System.out.println("anda meminjam "+judulBuku8);
                            System.out.println(judulBuku8+" yang tersedia sekarang sebanyak "+jumlahBuku8+" buku");
                            break;
                        case 9:
                            jumlahBuku9=pinjamBuku(jumlahBuku9);
                            System.out.println("anda meminjam "+judulBuku9);
                            System.out.println(judulBuku9+" yang tersedia sekarang sebanyak "+jumlahBuku9+" buku");
                            break;
                        case 10:
                            jumlahBuku1=pinjamBuku(jumlahBuku10);
                            System.out.println("anda meminjam "+judulBuku10);
                            System.out.println(judulBuku10+" yang tersedia sekarang sebanyak "+jumlahBuku10+" buku");
                            break;
                        case 11:
                            jumlahBuku11=pinjamBuku(jumlahBuku1);
                            System.out.println("anda meminjam "+judulBuku11);
                            System.out.println(judulBuku11+" yang tersedia sekarang sebanyak "+jumlahBuku1+" buku");
                            break;
                        case 12:
                            jumlahBuku12=pinjamBuku(jumlahBuku12);
                            System.out.println("anda meminjam "+judulBuku12);
                            System.out.println(judulBuku12+" yang tersedia sekarang sebanyak "+jumlahBuku12+" buku");
                            break;
                        case 13:
                            jumlahBuku13=pinjamBuku(jumlahBuku13);
                            System.out.println("anda meminjam "+judulBuku13);
                            System.out.println(judulBuku13+" yang tersedia sekarang sebanyak "+jumlahBuku13+" buku");
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Judul buku yang di request: ");
                    String capeGaBolehPakeArray=inputStr.nextLine();
                    requestBuku(capeGaBolehPakeArray);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                default:
                    Error();
            }


        } while (menuPerpus != 4);
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
        System.out.println("1. Bumi\n2. Bulan\n3. Matahari\n4. Bintang\n5. Ceros dan Batozar\n6. Komet \n7. Komet Minor\n8. Selena\n9. Nebula\n10. Si Putih\n11. Lumpu\n12. Bibi Gili\n13. Sagaras");
    }

    public static int pinjamBuku(int jumlahSekarang) {
        return jumlahSekarang - 1;
    }

    public static void requestBuku(String judul) {
        System.out.println(judul+" akan tersedia bulan Depan!");
    }

//    public static void clear() {
//        for (int i = 0; i < 100; i++)
//            System.out.println();
//    }

    public static void Error() {
        System.out.println("Input salah!");
    }

    public static void garis() {
        System.out.println("====================================================================================");
    }
}