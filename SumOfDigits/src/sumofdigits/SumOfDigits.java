/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author katya
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int digit = scanner.nextInt();
//        sustem.out.print("%d", sum(digit));
        
        Sum sum = new Sum();
        
        System.out.println(sum.sum(digit));
        
        // TODO code application logic here
    }
    
}


//reverse