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
public class MergeSort implements Sort{
    int[] arr;
    @Override
    public int[] sort(int [] arr) {
        this.arr=arr;
        return mergeSort(0,arr.length-1);
    }
    private int[] mergeSort(int start,int end){
        if(start>=end){ 
            return new int[] {arr[start]} ;
        }
        int mid=(start+end)/2;
        int[] left,right;
        left=mergeSort(start,mid);
        right=mergeSort(mid+1,end);
        return merge(left,right);
    }
    private int[] merge(int[] left,int[] right){
        int[] ret = new int[left.length+right.length];
        int i,j,k;
        for(i=0,j=0,k=0;i<left.length & j<right.length;){
            if(left[i]<right[j])
                ret[k++]=left[i++];
            else
                ret[k++]=right[j++];
        }
        while(i<left.length)
            ret[k++]=left[i++];
        while(j<right.length)
            ret[k++]=right[j++];
        return ret;
    }
    
}