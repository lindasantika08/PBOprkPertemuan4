/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.upinipin;

/**
 *
 * @author LINDA
 */
public class Item {
    
    // Konstruktor Item yang tidak menerima parameter
    // Dalam konstruktor ini, nama item diatur sebagai "Ipin"
    private String name;
    private Item() {
        name = "Ipin";
    }
    
    // Konstruktor Item yang menerima parameter nama item
    // Konstruktor ini menggunakan konstruktor lain (tanpa parameter) dengan
    // menggunakan "this()" untuk mengatur nama item sebagai "Ipin" terlebih dahulu
    public Item(String name) {
        this(); // Solusi untuk solusi 2
        System.out.println(this.name);
    }
}
