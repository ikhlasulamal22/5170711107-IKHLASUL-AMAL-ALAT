package amal10;
import java.util.Scanner;
public class Amal10 {

    
    public static void main(String[] args) {
        int jmlh, pil;

        Scanner input = new Scanner(System.in);
        Alat sampoerna = new Alat();
        Mandi clasmild = new Mandi();
        Tulis surya = new Tulis () ;
        Kesehatan signature = new Kesehatan();

        System.out.println("Pilihan Alat : ");
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Kesehatan");
        System.out.println("3. Alat Tulis");
        System.out.print("Pilih : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                   clasmild.Nama();
                   clasmild.Merk();
                   clasmild.Harga();
                   clasmild.Bentuk();
                   clasmild.Warna();
                    break;
                case 2:
                    surya.Nama();
                    surya.Merk();
                    surya.Harga();
                    surya.Fungsi();
                    surya.DimensiAlat();
                    break;
                case 3:
                    signature.Nama();
                    signature.Merk();
                    signature.Harga();
                    signature.Jenis();
                    signature.Manfaat();
                    break;
                default:
                    System.out.println("tidak ada Pilihan");
                    break;
            }
            System.out.println("-----------------------");
            switch (pil) {
                case 1:
                    System.out.println("Nama alat: " + clasmild.nama);
                    System.out.println("Merk alat : " + clasmild.merk);
                    System.out.println("Harga alat : " +clasmild.hrg);
                    System.out.println("Wujud alat : " +clasmild.wuj);
                    System.out.println("Warna alat : " + clasmild.wrna);
                    break;
                case 2:
                    System.out.println("Nama alat: " + surya.nama);
                    System.out.println("Merk alat: " + surya.merk);
                    System.out.println("Harga alat: " + surya.hrg);
                    System.out.println("Bentuk alat: " + surya.fgs);
                    System.out.println("Warna alat: " + surya.dmsi);
                    break;
                case 3:
                    System.out.println("Nama alat: " + signature.nama);
                    System.out.println("Merk alat: " + signature.merk);
                    System.out.println("Harga alat : " + signature.hrg);
                    System.out.println("Jenis alat : " + signature.jns);
                    System.out.println("Manfaat alat : " + signature.mft);
                    break;
                default:
                    break;
            }
        }

    }
    
