/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//программа вычисляет с помощью рекурсии сумму чисел в числе
package sumofdigits;

/**
 *
 * @author katya
 */
public class Sum {
        int sum(int n) {
        int result = 0;

        if (n < 10)
            return n;
        result = sum(n/10) + n % 10;
        return result;
    }
    
    
    
}
