/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan29;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program warna kepribadian
 * 
 * 
 */
public class WarnaKepribadian {
    private final Scanner scanner;
    
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_MERAH = "\u001B[31m";
    private final String ANSI_MERAH_BACKGROUND = "\u001B[41m";
    private final String ANSI_HIJAU = "\u001B[32m";
    private final String ANSI_HIJAU_BACKGROUND = "\u001B[42m";
    private final String ANSI_KUNING = "\u001B[33m";
    private final String ANSI_KUNING_BACKGROUND = "\u001B[43m";
    private final String ANSI_BIRU = "\u001B[34m";
    private final String ANSI_BIRU_BACKGROUND = "\u001B[44m";
    private final String ANSI_UNGU = "\u001B[35m";
    private final String ANSI_UNGU_BACKGROUND = "\u001B[45m";
    private final String ANSI_TOSKA = "\u001B[36m";
    private final String ANSI_TOSKA_BACKGROUND = "\u001B[46m";
    private final String ANSI_PUTIH = "\u001B[37m";
    private final String ANSI_PUTIH_BACKGROUND = "\u001B[47m";
    private final String ANSI_HITAM = "\u001B[30m";
    private final String ANSI_HITAM_BACKGROUND = "\u001B[40m";
    
    
    enum WARNA {
        MERAH,
        HIJAU,
        KUNING,
        BIRU,
        UNGU
    }
    
    private WarnaKepribadian() {scanner = new Scanner(System.in);}
    
    private String getInput() {return scanner.nextLine();}
    
    private WARNA getWarna(String warna) {
        warna = warna.toLowerCase();
        switch(warna) {
            case "merah":
                return WARNA.MERAH;
            case "hijau":
                return WARNA.HIJAU;
            case "kuning":
                return WARNA.KUNING;
            case "biru":
                return WARNA.BIRU;
            case "ungu":
                return WARNA.UNGU;
            default:
                System.err.println("Gagal proses, Masukkan tidak dikenal!");
                return null;
        }
    }
    
    private boolean penuhWarna() {
        System.out.println(ANSI_MERAH.concat("YUK ").concat(ANSI_HIJAU).
                concat("CEK ").concat(ANSI_KUNING).concat("KEPRIBADIANMU ").
                concat(ANSI_TOSKA).concat("DARI ").concat(ANSI_UNGU).
                concat("WARNA ").concat(ANSI_BIRU).concat("FAVORITMU"));
        System.out.println("");
        System.out.println(ANSI_MERAH_BACKGROUND.concat(ANSI_PUTIH).
                concat("        MERAH           "));
        System.out.println(ANSI_HIJAU_BACKGROUND.concat(ANSI_PUTIH).
                concat("        HIJAU           "));
        System.out.println(ANSI_KUNING_BACKGROUND.concat(ANSI_PUTIH).
                concat("        KUNING          "));
        System.out.println(ANSI_BIRU_BACKGROUND.concat(ANSI_PUTIH).
                concat("        BIRU            "));
        System.out.println(ANSI_UNGU_BACKGROUND.concat(ANSI_PUTIH).
                concat("        UNGU            "));
        System.out.println(ANSI_RESET);
        return true;
    }
    
    private boolean tampilWarna(WARNA warna) {
        switch (warna) {
            case MERAH:
                tampilMerah();
                break;
            case HIJAU:
                tampilHijau();
                break;
            case KUNING:
                tampilKuning();
                break;
            case BIRU:
                tampilBiru();
                break;
            case UNGU:
                tampilUngu();
                break;
            default:
                System.err.println("Coding Error / System Error");
                return false;
        }
        return true;
    }
    
    private boolean tampilBiru() {
        System.out.println(ANSI_RESET.concat("Warna Favoritmu adalah ").
                concat(ANSI_BIRU.concat("BIRU")));
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya "
                + "yang cenderung mencari jalan damai.");
        return true;
    }
    
    private boolean tampilMerah() {
        System.out.println(ANSI_RESET.concat("Warna Favoritmu adalah ").
                concat(ANSI_MERAH.concat("MERAH")));
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah "
                + "tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangantan dan cinta.");
        return true;
    }
    
    private boolean tampilKuning() {
        System.out.println(ANSI_RESET.concat("Warna Favoritmu adalah ").
                concat(ANSI_KUNING.concat("KUNING")));
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, "
                + "seringkali goyah dan tidak stabil,");
        System.out.println("10. Cenderung penakut.");
        return true;
    }
    
    private boolean tampilUngu() {
        System.out.println(ANSI_RESET.concat("Warna Favoritmu adalah ").
                concat(ANSI_UNGU.concat("UNGU")));
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang "
                + "memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali "
                + "menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
        return true;
    }
    
    private boolean tampilHijau() {
        System.out.println(ANSI_RESET.concat("Warna Favoritmu adalah ").
                concat(ANSI_HIJAU.concat("HIJAU")));
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan "
                + "kepercayaan.");
        return true;
    }
    
    private boolean tampilHasil(WARNA warna) {
        System.out.println("===HASIL TEST KEPRIBADIAN ".concat(namaKamu).
                concat("==="));
        tampilWarna(warna);
        return true;
    }
    
    // variables
    String namaKamu;
    
    private int start() {
        String input;
        WARNA warna;
        penuhWarna();
        System.out.print("PILIH WARNA FAVORITMU : ");
        input = getInput();
        if(getWarna(input)!=null) warna = getWarna(input);
        else return -1;
        System.out.print("NAMA KAMU : ");
        input = getInput();
        System.out.println("");
        namaKamu = input;
        tampilHasil(warna);
        return 0;
    }
    
    public static void main(String[] args) {
        WarnaKepribadian program = new WarnaKepribadian();
        program.start();
    }
}
