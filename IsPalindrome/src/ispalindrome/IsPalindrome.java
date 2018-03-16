/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispalindrome;

import java.util.Scanner;
/**
 *
 * @author katya
 */
public class IsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         String ln = scanner.nextLine();
         System.out.print("\n" + ln);
         int i;
         int flag = 0;
         for ( i = 0; i < ln.length; i++)
             if ( ln[i] ==  ' ')
                ln = deleteCharacters(out, i, 1); 
        for ( i  = 0; i < ln.length/2; i++)    
             if ( ln[i] != ln [length - 1 - i])
                 flag = 1;
         if (flag == 0)
             System.out.print("поиндром");
         else
             System.out.print("не поиндром");
        
// TODO code application logic here
    }
    
}
