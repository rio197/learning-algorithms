/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alog.binarysearch;

/**
 *
 * @author rio197
 */
public class App {
    public static void main(String[] args) {
    int[] myArray = new int[10]; 
        int jj = 11, index;
                
        for (int ii=0; ii < myArray.length ; ii++) {
            myArray[ii] = jj;
            System.out.print(myArray[ii] + " ");
            jj++;
        }        
        
        System.out.println();
        index = binarySearch(myArray, 22);
        System.out.println(index);
    }
    
    public static int binarySearch(int[] a, int x) {
        int p = 0, r = a.length - 1;
        int q;

        while (p <= r) {
            q = (p + r) / 2;
            if (a[q] > x)
                r = q - 1;
            else if (a[q] > x)
                p = q + 1;
            else
                return q;
        }
        
        return -1;
    }
}
