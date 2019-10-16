/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan36.targetsaldo;

/**
 *
 * @author User
 */
public class saldo {
    public  int saldo1,saldotarget ;
    public double bunga;

    public  void setSaldo1(int saldo1) {
        this.saldo1= saldo1;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    public  void setSaldo2(int saldotarget) {
        this.saldotarget = saldotarget;
    }
  
    
    public void tabungan(){
    do{
       
        
        
        saldo1=(int) (saldo1+(saldo1*bunga)); 
        int  i= 0;
        i=1+0;
        
        System.out.println("saldo di bulan ke-"+(i++)+"Rp."+saldo1);
        
        }while(saldo1<6000000);
    }

  
}
