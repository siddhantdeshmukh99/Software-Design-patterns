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
public class ConcreteIterator implements Iterator{
    private ConcreteIterable iterable;
    private int statepointer;
    public ConcreteIterator(ConcreteIterable iterable){
        this.iterable=iterable;
        this.statepointer=-1;
    }

    @Override
    public boolean hasNext() {
        return iterable.size>statepointer+1;
    }

    @Override
    public int getNext() {
        return iterable.get(++statepointer);
    }
    
}
