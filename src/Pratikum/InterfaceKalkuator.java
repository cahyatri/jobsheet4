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
public class InterfaceKalkuator implements InterfaceOperasi
{
     double Bil1;//atribut
    double Bil2;

//method
public double getBil1()
{
        return Bil1;
}
//method
public double getBil2()
{
        return Bil2;
}
    public InterfaceKalkuator(double Bil1,double Bil2)//constructor
    {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }
    @Override
    public double penjumlahan(){
        return Bil1+Bil2;
    }
    @Override
    public double pengurangan(){
        return Bil1 - Bil2;
    }
    @Override
    public double perkalian(){
        return Bil1 * Bil2;
    }
    @Override
    public double pembagian()
    {
        return Bil1 / Bil2;
    }

}
