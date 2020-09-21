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
public class BubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        for(int i=0;i<arr.length;i++)
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    arr[j]+=arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]=arr[j]-arr[j-1];
                }
            }
        return arr;
    }
    
}
