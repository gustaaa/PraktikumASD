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
public class SepedaMotor {
    public String merk;
    public int kecepatanMotor;
    public boolean kontakMotor;
    
    public SepedaMotor(){
        
    }
    public SepedaMotor(String merk){
        this.merk = merk;
    }
    public void nyalakanMotor(boolean kontak){       
           
    }
    public void matikanMotor(boolean kontak){
     
    }
    public void tambahKecepatan(int kec){
       
    }
    public void kurangiKecepatan(int kec){
        
    }
    public void info(){
        System.out.println("------------------------------------");
        System.out.println("==== -------SEPEDA MOTOR------- ====");
        System.out.println("------------------------------------");
        System.out.println("Nama Merk\t\t\t : "+merk);
        
    }
}
