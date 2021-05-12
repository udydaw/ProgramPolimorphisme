/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttoko;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ProjectToko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko parentclass = new Toko();
        parentclass.setAdmin("ADM 1");
        parentclass.Display();
        parentclass.getAdmin();

        Scanner beli = new Scanner(System.in);
        int menu;
        int pilih;

        System.out.println("Project Toko");
        System.out.println("Pilihan produk: \n 1. Smartphone \n 2. Televisi \n 3. Kipas Angin \n");
        System.out.print("Masukkan pilihan: ");
        pilih = beli.nextInt();
        System.out.println("=================");
        System.out.println("");
        switch(pilih){
            case 1: 
                SmartPhone produk1 = new SmartPhone();
                produk1.setMerk("Samsung Galaxy Note20 Ultra");
                produk1.setjmlkamera(4);
                produk1.setHarga(17999000);
                produk1.setTotal(1);
                produk1.getMerk();
                produk1.getjmlkamera();
                produk1.getHarga();
                produk1.getTotal();
            break;
            case 2:
                TV produk2 = new TV();
                produk2.setMerk("Samsung LED Curved TV 49 Inch");
                produk2.setJenis("TV QLED");
                produk2.setHarga(100000000);
                produk2.setTotal(1);
                produk2.getMerk();
                produk2.getJenis();
                produk2.getHarga();
                produk2.getTotal();
            break;
            case 3:
                KipasAngin produk3 = new KipasAngin();
                produk3.setMerk(" Panasonic FEP405 ");
                produk3.setUkuran(16);
                produk3.setHarga(540000);
                produk3.setTotal(1);
                produk3.getMerk();
                produk3.getUkuran();
                produk3.getHarga();
                produk3.getTotal();
            break;
            default:
            System.out.println("Maaf, pilihan yang anda masukkan tidak ada, terima kasih.");    
        }
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("    TERIMA KASIH SUDAH BERBELANJA    ");
        System.out.println("                  DI                 ");
        System.out.println("    TOKO ELEKTRONIK LANCAR JAYA      ");
        System.out.println("=====================================");
    }
}
