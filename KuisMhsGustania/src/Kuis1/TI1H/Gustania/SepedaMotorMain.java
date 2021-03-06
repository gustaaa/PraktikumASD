/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1.TI1H.Gustania;

/**
 *
 * @author Asus
 */
public class SepedaMotorMain {
    public static void main(String[] args) {
        SepedaMotor spd = new SepedaMotor();
        spd.merk = "Suzuki";
        spd.merk = "Honda";
        spd.merk = "Yamaha";
        spd.merk = "Ducati";
        spd.kontakMotor = false;
        
        
        
        spd.info();
    }
}
