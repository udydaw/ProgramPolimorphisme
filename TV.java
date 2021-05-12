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
public class TV extends Toko{
   
    //Variabel Instance
    String jenis;

    //Method set untuk harga
    public void setHarga(int harga){
        super.harga = harga;
    }

    //Method get untuk harga
    public float getHarga(){
        System.out.println("Harga : "+harga);
        return harga;
    }

    //Method set untuk total
    public void setTotal(int total){
        super.total = total;
    }

    //Method get untuk total
    public float getTotal(){
        System.out.println("Total : "+total);
        return total;
    }

    //Method set untuk merk
    public void setMerk(String merk){
        super.merk = merk;
    }

    //Method get untuk merk
    public String getMerk(){
        System.out.println("Merk : "+merk);
        return merk;
    }

    //Method set untuk jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    //Method get untuk jenis
    public String getJenis(){
        System.out.println("Jenis : "+jenis);
        return jenis;
    }

    //Menerapkan override
    public void display(){
        System.out.println("Data Barang Yang di Entry : ");
    } 
}
