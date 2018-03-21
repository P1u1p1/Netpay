/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package netpay;

/**
 *
 * @author seeng1309
 */
public class Netpay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double h = 40;
       double w = 5;
       double i = 2;
       double t = .22;
       double netpay = (h*w-i)-t*(h*w-i);
  
       System.out.println("woah bro, the taxman really got ya good, but in the end you made " + netpay + "$");
    }
    
    
}
