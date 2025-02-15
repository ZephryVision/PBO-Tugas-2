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

public class Tugas_2_Boolean {
    public static void main(String[] args) {
        Scanner uangInput = new Scanner(System.in);
        System.out.println("masukkan uang");
        
        int uang = uangInput.nextInt();
        boolean tidakAdaKelas = true;
        
        boolean jadiBeli = (uang > 10000) && tidakAdaKelas;
        
         System.out.println(jadiBeli ? "Beli Gacoan!" : "Jangan dulu!.");
    }
}
