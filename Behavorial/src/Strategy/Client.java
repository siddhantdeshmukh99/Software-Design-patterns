/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import java.util.Arrays;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class Client {
    
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,2,6,3,9};
        Context con = new Context();
        BubbleSort bub = new BubbleSort();
        QuickSort qk = new QuickSort();
        MergeSort mg = new MergeSort();
        con.sortBy(mg);
        System.out.println(Arrays.toString(con.getSortedArray(arr)));
        con.sortBy(bub);
        System.out.println(Arrays.toString(con.getSortedArray(arr)));
        con.sortBy(qk);
        System.out.println(Arrays.toString(con.getSortedArray(arr)));
        
    }
        
}
