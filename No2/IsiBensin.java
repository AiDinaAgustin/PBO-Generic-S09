/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayDeque;

public class IsiBensin {
  public static void main(String[] args) {
    // Membuat ArrayDeque bernama antrianKendaraan
    ArrayDeque<String> antrianKendaraan = new ArrayDeque<>();

    // Menambahkan beberapa kendaraan ke antrianKendaraan
    antrianKendaraan.add("Mobil A");
    antrianKendaraan.add("Mobil B");
    antrianKendaraan.add("Mobil C");
    antrianKendaraan.add("Mobil D");
    antrianKendaraan.add("Mobil E");

    // Mencetak daftar kendaraan di antrianKendaraan
    System.out.println("Daftar Kendaraan:");
    for (String kendaraan : antrianKendaraan) {
      System.out.println(kendaraan);
    }

    // Mengisi bensin untuk kendaraan pertama di antrianKendaraan
    String kendaraanSedangDiproses = antrianKendaraan.poll();
    System.out.println("\nSedang mengisi bensin untuk kendaraan: " + kendaraanSedangDiproses);

    
    // Mencetak daftar kendaraan di antrianKendaraan setelah diproses
    System.out.println("\nDaftar Kendaraan Setelah Diproses:");
    for (String kendaraan : antrianKendaraan) {
      System.out.println(kendaraan);
    }
  }
}

