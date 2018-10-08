/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan37.objectorientedprogramratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Nim : 10117104
 * Kelas : IF-3/PBO3
 * Deskripsi Program : Menghasilkan dan menampilkan hasil dari 
 * rata-rata nilai yang dimasukkan user . (secara object oriented)   
 */
public class PBO310117104Latihan37ObjectOrientedProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa mhs = new NilaiMahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mhs.hitungTotal(mhs.nilaiMhs, n);
         mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "
                +mhs.hitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
        System.out.println("(Developed by : Aditya Suheryana)");
    }
} 
