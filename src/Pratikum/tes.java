/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

import java.util.Scanner;

/**
 *
 * @author MPC
 */
public class tes {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        Manusia l = new lakilaki(0);
        Manusia p = new perempuan(0);
        String Kelamin;
        System.out.println("User 1");
        System.out.print("Masukan  Tinggi Badan Anda (cm) = " );
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin = ");
        Kelamin = masukan.next();
        switch (Kelamin){
            case "L":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.print("Berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
             case "p":System.out.print("Berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            
        }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("Masukan  Tinggi Badan Anda (cm) = " );
        l.TinggiBadan = p.TinggiBadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin = ");
        Kelamin = masukan.next();
        switch (Kelamin){
            case "L":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.print("Berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
             case "p":System.out.print("Berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            
    }
    
}
}
