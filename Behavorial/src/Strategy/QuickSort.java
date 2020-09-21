/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class QuickSort implements Sort {


    int[] arr;
    @Override
    public int[] sort(int[] arr) {
        this.arr=arr;
        quickSort(0,arr.length-1);
        return this.arr;
    }
    private void quickSort(int low,int high){
        if (low < high) 
        { 
            int pi = partition( low, high); 
  
            quickSort(low, pi-1); 
            quickSort( pi+1, high); 
        } 
    }
    private int partition(int low,int high){
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        //
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1;
    }
    
}
