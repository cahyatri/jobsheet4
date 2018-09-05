/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MPC
 */
public class hewan {
    //method Default
    void setNama(){
        String hewan = "Tidak Bernama";
        System.out.println("Nama Hewan  : " +hewan);
    }
    void setSuara(){
        String suara = "Tidak bersuara";
        System.out.println("Suara Hewan : " +suara);
    }
    void setBerat(){
        double berat = 0.0;
        System.out.println("Berat Hewan : " +berat+"Kg");
    }

}
class kucing extends hewan{
    
    @Override
    void setNama(){
        String kucing = "Carberus";
        System.out.println("Nama Kucing   : " +kucing);
    }
    @Override
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println(" Suara kucing : " +suara);
    }
     @Override
    void setBerat(){
        double berat =  2.0;
        System.out.println(" berat kucing : " +berat+"Kg");
    }
}
class singa extends hewan{
     @Override
    void setNama(){
        String singa = "Diablo";
        System.out.println(" Nama Singa  : "+singa);
    }
     @Override
    void setSuara(){
        String suara = "Roaaarrrr";
        System.out.println(" Suara Singa : " +suara);
    }
    @Override
    void setBerat(){
        double berat = 10.0;
        System.out.println(" Berat Singa : "+berat+"Kg");
    }
}
