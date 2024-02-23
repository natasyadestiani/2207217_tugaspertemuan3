/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kubus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Kubus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input tiga sisi
        System.out.println("Masukkan panjang sisi A:");
        double sisiA = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi B:");
        double sisiB = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi C:");
        double sisiC = scanner.nextDouble();

        // Memeriksa apakah semua sisi sama
        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
