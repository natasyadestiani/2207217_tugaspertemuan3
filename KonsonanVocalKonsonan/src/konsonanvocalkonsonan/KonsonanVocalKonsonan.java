/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konsonanvocalkonsonan;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class KonsonanVocalKonsonan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input tiga karakter
        System.out.println("Masukkan tiga karakter (huruf kecil):");
        String input = scanner.nextLine();

        // Pastikan panjang input adalah 3 karakter
        if (input.length() != 3) {
            System.out.println("Input harus terdiri dari tiga karakter.");
            return;
        }

        char char1 = input.charAt(0);
        char char2 = input.charAt(1);
        char char3 = input.charAt(2);

        // Periksa apakah karakter pertama adalah konsonan
        if (!isConsonant(char1)) {
            System.out.println("Pola konsonan-vokal-konsonan tidak terpenuhi.");
            return;
        }

        // Periksa apakah karakter kedua adalah vokal
        if (!isVowel(char2)) {
            System.out.println("Pola konsonan-vokal-konsonan tidak terpenuhi.");
            return;
        }

        // Periksa apakah karakter ketiga adalah konsonan
        if (!isConsonant(char3)) {
            System.out.println("Pola konsonan-vokal-konsonan tidak terpenuhi.");
            return;
        }

        // Jika semua kondisi terpenuhi, keluarkan pesan bahwa pola konsonan-vokal-konsonan terpenuhi
        System.out.println("Pola konsonan-vokal-konsonan terpenuhi.");
    }

    // Method untuk memeriksa apakah sebuah karakter adalah konsonan
    public static boolean isConsonant(char c) {
        return c >= 'a' && c <= 'z' && !"aeiou".contains(String.valueOf(c));
    }

    // Method untuk memeriksa apakah sebuah karakter adalah vokal
    public static boolean isVowel(char c) {
        return c >= 'a' && c <= 'z' && "aeiou".contains(String.valueOf(c));
    }
}
