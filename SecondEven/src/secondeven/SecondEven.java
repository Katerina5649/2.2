/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondeven;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author katya
 */
public class SecondEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        
        
        int size = 7;
        int i = 0;
        int[] arr = new int[size];
        System.out.print("Иcходный массив \n");
        for ( i = 0; i < size; i++){
           arr[i] = 2 *rnd.nextInt(50); // случайные четный числа от 0 до 100
           System.out.print(arr[i]+" ");
           if (( i % 2 == 0) && (i != 0))
               arr[i] *= arr[i-2];

        
        }
        System.out.println("\n Измененный массив :");       
        for (i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
            
    }
    
}
