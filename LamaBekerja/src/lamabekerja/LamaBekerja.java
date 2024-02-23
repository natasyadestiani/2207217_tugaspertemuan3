/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamabekerja;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class LamaBekerja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input jam masuk dan jam keluar
        System.out.println("Masukkan jam masuk (dalam rentang 1-12):");
        int jamMasuk = scanner.nextInt();

        System.out.println("Masukkan jam keluar (dalam rentang 1-12):");
        int jamKeluar = scanner.nextInt();

        // Menghitung lama bekerja
        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            // Jika jam keluar lebih kecil dari jam masuk, maka bekerja hingga keesokan harinya
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }

        // Menampilkan lama bekerja
        System.out.println("Lama bekerja: " + lamaBekerja + " jam");
    }
}
