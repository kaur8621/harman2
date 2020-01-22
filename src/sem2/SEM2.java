/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SEM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         int i;
          
         
         String [] s= new String[5];
           System.out.println("ENTER ANY CHARACTER=");
           for( i=0;i<s.length;i++)
         {
          s[i]=input.nextLine();
          
         }
             for( i=0;i<s.length;i++)
         {
          System.out.println("character="+ s[i]);
         }
    }
    
}
