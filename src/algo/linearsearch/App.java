/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.linearsearch;

/**
 *
 * @author rio197
 */
public class App {
    public static void main (String[] args) {
        int[] data = new int[10];
        int result;
        
       data[0] = 11;
       data[1] = 12;
       data[2] = 13;
       data[3] = 14;
       data[4] = 15;
       data[5] = 16;
       data[6] = 17;
       data[7] = 18;
       data[8] = 19;
       data[9] = 120;
       
       result = linearSearch(data, 100);
       System.out.println(result);
    }
    
    public static int linearSearch(int[] temp, int x) {
        
        for (int ii=0; ii < temp.length; ii++) {
            if (temp[ii] == x) {
                return ii;
            }
        }
        
        return -1;
    }
}
