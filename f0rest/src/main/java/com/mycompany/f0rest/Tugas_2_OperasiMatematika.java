/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.f0rest;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class Tugas_2_OperasiMatematika {
    public static void main(String[] args) {
        Scanner angkaInput = new Scanner( System.in);
        System.out.println("masukkan angka : ");
        
        int a = angkaInput.nextInt();
        int b = angkaInput.nextInt();
        int c = angkaInput.nextInt();
        
        System.out.println("Hasil : ");
        System.out.println("Penjumlahan");
        System.out.println(a+b+c);
        System.out.println("pengurangan");
        System.out.println(a-b-c);
        System.out.println("Pembagian");
        System.out.println(a/b/c);
        System.out.println("Perkalian");
        System.out.println(a*b*c);
    }
}
