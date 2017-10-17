/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco2;
class Bank{  
    float getRateOfInterest(){return 0;}  
}  
  
class SBI extends Bank{  
    float getRateOfInterest(){return 8.1f;}  
}  
  
class ICICI extends Bank{  
    float getRateOfInterest(){return 7.2f;}  
}  
class AXIS extends Bank{  
    float getRateOfInterest(){return 9.1f;}  
}  
  
class test{  
    public static void main(String args[]){  
       Bank b;
       b = new SBI();
        System.out.println("SBI interes: "+b.getRateOfInterest());
         b = new ICICI();
        System.out.println("ICICI interes: "+b.getRateOfInterest());
         b = new AXIS();
        System.out.println("AXIS interes: "+ b.getRateOfInterest());
    }  
}  
