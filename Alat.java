package amal10;
import java.util.Scanner;
public class Alat {
     String nama, merk;
    long hrg;
    static Scanner ya = new Scanner(System.in);
    public void Nama(){
        System.out.print("Nama : ");
        nama = ya.next();
    }
    
    public void Merk(){
        System.out.print("Merk : ");
        merk = ya.next();
    }

    public void Harga() {
        System.out.print("Harga : ");
        hrg = ya.nextLong();
    }
}
