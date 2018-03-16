
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumber;
//в массиве программа находит и выводит четные числа делящиеся на 3

import java.util.Scanner;

/**
 *
 * @author katya
 */
public class EvenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
//        scaner.nextInt();
        
        int i;
        int[] a = new int[n];
        for ( i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for ( i = 0; i < n; i++)
            if ( a[i] % 6 == 0 )
                System.out.print(a[i]+" ");
                
        
        // TODO code application logic here
    }
    
}
