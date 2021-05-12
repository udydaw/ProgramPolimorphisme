/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttoko;

/**
 *
 * @author ACER
 */
public class Toko {
    private String admin;
    String merk;
    int harga;
    int total;

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        System.out.println("=====================================");
        System.out.println("KASIR: "+admin+"    16:32:47    10/05/20");
        System.out.println("=====================================");
        return admin;
    }
    public void Display(){
        System.out.println("Nota : ");
        System.out.println("     Jl.Pattimura  (0331)3344562     ");
            System.out.println("     TOKO ELEKTRONIK LANCAR JAYA    ");
    }
}