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
public class Context {
    private Sort sort;
    public void sortBy(Sort sort){
        this.sort = sort;
    }
    
    public int[] getSortedArray(int[] arr){
        return this.sort.sort(arr);
    }
}
