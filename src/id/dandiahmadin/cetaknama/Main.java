/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.cetaknama;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi cetak nama dengan pendekatan object oriented
 */
public class Main {
    private static String nama;
    private static int jumlah;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.print("Mau cetak berapa kali? : ");
        jumlah = input.nextInt();
        
        Printer printer1 = new Printer();
        printer1.setNama(nama);
        printer1.setJmlCetak(jumlah);
        printer1.cetak(nama);
        printer1.cetak(jumlah, nama);
        
    }
}
