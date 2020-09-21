/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;
import Strategy.Context;
import Strategy.QuickSort;
/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public class ConcreteIterable implements IterableCollection {

    int size;
    private int[] arr;
    public ConcreteIterable(int size){
        arr=new int[size];
        this.size=size;
    }
    @Override
    public int get(int i) {
       return arr[i];
    }

    @Override
    public void set(int val, int i) {
        arr[i]=val;
    }

    @Override
    public void sort() {
        Context con = new Context();
        con.sortBy(new QuickSort());
        arr = con.getSortedArray(arr);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(this);
    }
    
}
