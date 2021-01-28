/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banknotes;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author Mohamed Kamal Abdelaziz Ahmed
 */
public class Banknotes 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //VAARIABLES
       Scanner input = new Scanner(System.in);
        
        int[] money = {100, 50, 20, 10, 5, 2};
        double[] coin = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        double note, n;
        
        //INPUT
        System.out.print("Enter your banknotes\n==>");
        n =input.nextDouble();
        
        //PROCESSING
        System.out.println("NOTAS:");
        for (int i = 0; i < money.length; i++) 
        {
            note = n / money[i];
            System.out.println((int)note + " nota(s) de R$ " + money[i] +".00");
            n = n % money[i];
        }
        
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length-1; i++) 
        {
            note =  n / coin[i];
            
            System.out.println((int)note + " moeda(s) de R$ "+String.format("%.2f",coin[i]));
            n = n % coin[i];
        }
        note =  n / coin[coin.length-1];
        System.out.println(round(note) + " moeda(s) de R$ "+String.format("%.2f",coin[coin.length-1]));
       
    }
    
}
