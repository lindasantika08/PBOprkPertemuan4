/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kelasdua;

/**
 *
 * @author LINDA
 */
class KelasSatu {
    {
        // Mencetak angka 11 dalam blok inisialisasi
        System.out.println(11); 
    }
    
    static {
        // Mencetak angka 2 dalam blok statik
        System.out.println(2);
    }
    
    // Konstruktor KelasSatu dengan satu argumen, i Nilai argumen yang digunakan untuk mencetak angka 3
    public KelasSatu (int i) {
        System.out.println(3); // Mencetak angka 3 saat objek dibuat dengan argumen
    }
    
    // Konstuktor KelasSatu tanpa argumen
    public KelasSatu(){
        System.out.println(4); // Mencetak angka 4 saat objek dibuat tanpa argumen
    }
}
