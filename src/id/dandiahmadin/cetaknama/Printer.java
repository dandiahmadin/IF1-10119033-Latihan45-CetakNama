/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.cetaknama;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Printer
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Nama Anda : ".concat(nama));
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak :");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". ".concat(nama));
        }
    }
}
