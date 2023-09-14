/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventori;

/**
 *
 * @author LINDA
 */
public class Inventori {
    Barang[] barangs;
    
    // Metode initBarang inisialisasi daftar barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    // Metode showBarang menampilkan informasi barang
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].stok + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].stok + ")");
    }
    
    // Metode penyediaan mengelola proses pengadaan barang
    void pengadaan() {
        initBarang();
        
        barangs[0].stok += 20;
        barangs[1].stok += 20;
        // Komentari baris di bawah untuk menghindari pengurangan dan perkalian
//        barangs[0].stok -= 30; // Emang bisa juga dikurangi? // ketika ini yang tidak di comment maka hasil baju 0
//        barangs[0].stok *= 30; // Dikali bisa tak? //ketika ini dijalankan hasil baju 900
        showBarang();
    }
    
    // Metode main adalah titik masuk untuk menjalankan program
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}

