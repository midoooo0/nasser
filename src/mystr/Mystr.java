/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystr;

/**
 *
 * @author K I N G
 */
public class Mystr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       java.util.Scanner s = new java.util.Scanner (System.in);
       System.out.println ("Enter The Grade :");
       int g = s.nextInt();
       String str = (g>=50)? "pass" : "Fail" ;
           System.out.println (str);   
        
    }
    
}
