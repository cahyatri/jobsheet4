/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author MPC
 */
public abstract class Manusia {
    public double TinggiBadan;
    
    public void Manusia(double TB){
        TinggiBadan = TB;
    }
    public double getTinggiBadan(){
        return TinggiBadan;
    }
   public abstract double htgbbi();
}
