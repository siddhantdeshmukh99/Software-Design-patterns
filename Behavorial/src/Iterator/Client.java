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
public class Client {
    public static void main(String[] args) {
        IterableCollection arr = new ConcreteIterable(5);
        arr.set(4, 0);
        arr.set(1, 1);
        arr.set(3, 2);
        arr.set(2, 3);
        arr.set(5, 4);
        //arr.sort();
        // now lets check if the array is sorted or not
        Iterator itr = arr.getIterator();
        int a,b; // to store the first variable if exists and for further iterations
        if(itr.hasNext()){
            a = itr.getNext();
        }else{
            System.out.println("the array is empty");
            return;
        }
        
        while(itr.hasNext()){
            b=itr.getNext();
            if(b>a){
                a=b;
            }else{
                System.out.println("not sorted");
                return;
            }
        }
        System.out.println("the array is sorted");
        
    }
}
