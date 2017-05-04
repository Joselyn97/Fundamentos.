/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta_Bancaria;
 
/**
*
* @author ADMIN-MINEDUC
*/
class CuentaBancaria {
    public int saldo;
    public static int numero=0;
   }
 
public class Variables{
public static void sumarSaldo(CuentaBancaria cta){
  cta.saldo+=10;
 
    }
    public static void sumarSaldo(int saldo){
        saldo +=10;
    }
   
    
    public static void main (String [] args){
        CuentaBancaria ct1 = new CuentaBancaria();
       
        ct1.saldo=1000;
        sumarSaldo (ct1);
        sumarSaldo (ct1);
       
        System.out.println("Objeto 1: "+ct1.saldo); //Imprime 1020
       
        
        CuentaBancaria jb = new CuentaBancaria();
        jb.saldo=3200;
       sumarSaldo(jb);
       
        System.out.println("Objeto 2: "+jb.saldo); //Imprime 3210
       
        CuentaBancaria ag = new CuentaBancaria();
        ag.saldo=670;
        sumarSaldo(ag);
        sumarSaldo(ag);
       
        System.out.println("Objeto 3: "+ag.saldo); //Imprime 690
       
        CuentaBancaria dl = new CuentaBancaria();
        dl.saldo=1900;
        sumarSaldo(dl);
        sumarSaldo(dl);
        sumarSaldo(dl);
       
        System.out.println("Objeto 4: "+dl.saldo); //Imprime 1930
       
        
        CuentaBancaria snsd = new CuentaBancaria();
        snsd.saldo=5500;
        sumarSaldo(snsd);
        sumarSaldo(snsd);
        sumarSaldo(snsd);
        sumarSaldo(snsd);
 
         System.out.println("Objeto 5: "+snsd.saldo); //Imprime 5540
       
        
        CuentaBancaria sj = new CuentaBancaria();
        sj.saldo=7600;
        sumarSaldo(sj);
        sumarSaldo(sj);
        sumarSaldo(sj);
        sumarSaldo(sj);
        sumarSaldo(sj);
       
        System.out.println("Objeto 6: "+sj.saldo); //Imprime 7650
       
        
        CuentaBancaria cute = new CuentaBancaria();
        cute.saldo=2080;
        sumarSaldo(cute);
        sumarSaldo(cute);
        sumarSaldo(cute);
       
        System.out.println("Objeto 7: "+cute.saldo); //Imprime 2110
       
        
        CuentaBancaria fh = new CuentaBancaria();
        fh.saldo=7030;
        sumarSaldo(fh);
        sumarSaldo(fh);
        sumarSaldo(fh);
       
        System.out.println("Objeto 8: "+fh.saldo); //Imprime 7060
       
        
        CuentaBancaria od = new CuentaBancaria();
        od.saldo=450;
        sumarSaldo(od);
        sumarSaldo(od);
        sumarSaldo(od);
       
       System.out.println("Objeto 9: "+od.saldo); //Imprime 480
       
        
        CuentaBancaria kyu = new CuentaBancaria();
        kyu.saldo=70;
        sumarSaldo(kyu);
        sumarSaldo(kyu);
        sumarSaldo(kyu);
       
        System.out.println("Objeto 10: "+kyu.saldo); //Imprime 100
       
    }
}