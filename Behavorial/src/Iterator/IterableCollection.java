/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author SIDDHANT_DESHMUKH
 */
public interface IterableCollection {
    int get(int i);
    void set(int val,int i);
    void sort();
    Iterator getIterator();
}
