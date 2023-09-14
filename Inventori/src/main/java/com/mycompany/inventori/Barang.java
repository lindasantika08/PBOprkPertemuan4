/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventori;

/**
 *
 * @author LINDA
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;
    
    // Konstruktor untuk kelas Barang
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    // Metode getStok digunakan untuk mendapatkan jumlah stok barang
    public int getStok() {
        return stok;
    }
    
    // Metode setStok digunakan untuk memperbarui jumlah stok barang dengan menambahkannya
    public void setStok(int stok) {
        this.stok += stok;
    }
}


